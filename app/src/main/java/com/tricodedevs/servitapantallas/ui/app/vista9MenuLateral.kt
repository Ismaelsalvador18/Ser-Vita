package com.tricodedevs.servitapantallas.ui.app

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun VistaPrincipal() {
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    val scope = rememberCoroutineScope()
    var selectedScreen by remember { mutableStateOf("Perfil") }

    ModalNavigationDrawer(
        drawerState = drawerState,
        drawerContent = {
            DrawerMenu(
                onCloseDrawer = { scope.launch { drawerState.close() } }
            )
        }
    ) {
        Scaffold(
            topBar = {
                TopAppBar(
                    title = {
                        Text(
                            text = "Ser+ Vida",
                            color = Color(0xFF4CAF50),
                            fontSize = 24.sp,
                            fontWeight = FontWeight.Bold,
                            textAlign = TextAlign.Center
                        )
                    },
                    navigationIcon = {
                        IconButton(onClick = {
                            scope.launch {
                                drawerState.open()
                            }
                        }) {
                            Icon(
                                imageVector = Icons.Default.Menu,
                                contentDescription = "Menú",
                                tint = Color.Black
                            )
                        }
                    },
                    colors = TopAppBarDefaults.topAppBarColors(
                        containerColor = Color(0xFFF5E7B2)
                    )
                )
            },
            bottomBar = {
                NavigationBar(
                    containerColor = Color.White
                ) {
                    NavigationBarItem(
                        selected = selectedScreen == "Perfil",
                        onClick = { selectedScreen = "Perfil" },
                        icon = { Icon(Icons.Default.Person, contentDescription = "Perfil") },
                        label = { Text("Perfil") }
                    )
                    NavigationBarItem(
                        selected = selectedScreen == "Hábitos",
                        onClick = { selectedScreen = "Hábitos" },
                        icon = { Icon(Icons.Default.List, contentDescription = "Hábitos") },
                        label = { Text("Hábitos") }
                    )
                    NavigationBarItem(
                        selected = selectedScreen == "Registros",
                        onClick = { selectedScreen = "Registros" },
                        icon = { Icon(Icons.Default.Article, contentDescription = "Registros") },
                        label = { Text("Registros") }
                    )
                }
            }
        ) { innerPadding ->
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(innerPadding)
                    .background(Color(0xFFF9F9F9)),
                contentAlignment = Alignment.Center
            ) {
                when (selectedScreen) {
                    "Perfil" -> PantallaContenido("Pantalla de Perfil")
                    "Hábitos" -> PantallaContenido("Pantalla de Hábitos")
                    "Registros" -> PantallaContenido("Pantalla de Registros")
                }
            }
        }
    }
}

@Composable
fun PantallaContenido(texto: String) {
    Text(
        text = texto,
        fontSize = 22.sp,
        color = Color(0xFF333333),
        fontWeight = FontWeight.Medium
    )
}

@Composable
fun DrawerMenu(onCloseDrawer: () -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFFFF4D1))
            .padding(16.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text("Configuración", fontSize = 20.sp, fontWeight = FontWeight.Bold)
            Icon(
                imageVector = Icons.Default.Close,
                contentDescription = "Cerrar menú",
                modifier = Modifier.clickable { onCloseDrawer() }
            )
        }

        Spacer(modifier = Modifier.height(16.dp))
        Divider(color = Color(0xFFF0B45D), thickness = 1.dp)

        DrawerItem("Preferencias")
        DrawerItem("Salir")
        DrawerItem("Ayuda")
        DrawerItem("Acerca de")
    }
}

@Composable
fun DrawerItem(text: String) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { /* acción */ }
            .padding(vertical = 12.dp)
    ) {
        Text(
            text = text,
            fontSize = 16.sp,
            color = Color.Black
        )
        Divider(color = Color(0xFFF0B45D), thickness = 1.dp)
    }
}
