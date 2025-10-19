package com.example.servita.ui.screens

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.Icon
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.tricodedevs.servitapantallas.ui.registros.GreatVibes


val YellowSoft = Color(0xFFF8E9B0)
val YellowBorder = Color(0xFFF5B570)
val TextColor = Color(0xFF333333)
val GreenAccent = Color(0xFF4CAF50)
val BackgroundLight = Color(0xFFFFFDF8)
val fondo = Color(0xFFFEF7DD)
val barra = Color(0xFFD9D9D9)



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainAppMetrica() {
    var currentScreen by remember { mutableStateOf("peso_altura") }

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        bottomBar = {
            NavigationBar(
                containerColor = Color.White,
                contentColor = TextColor
            ) {
                // === Item Perfil ===
                NavigationBarItem(
                    icon = {
                        Icon(
                            imageVector = Icons.Default.Person,
                            contentDescription = "Perfil"
                        )
                    },
                    label = { Text("Perfil", fontSize = 12.sp) },
                    selected = currentScreen == "perfil",
                    onClick = { currentScreen = "perfil" },
                    colors = NavigationBarItemDefaults.colors(
                        selectedIconColor = Color.Black,
                        unselectedIconColor = Color.Black,
                        selectedTextColor = Color.Black,
                        unselectedTextColor = Color.Black,
                        indicatorColor = Color(0xFFFFE580)
                    )
                )

                // === Item Hábitos ===
                NavigationBarItem(
                    icon = {
                        Icon(
                            imageVector = Icons.Default.List,
                            contentDescription = "Hábitos"
                        )
                    },
                    label = { Text("Hábitos", fontSize = 12.sp) },
                    selected = currentScreen == "habitos",
                    onClick = { currentScreen = "habitos" },
                    colors = NavigationBarItemDefaults.colors(
                        selectedIconColor = Color.Black,
                        unselectedIconColor = Color.Black,
                        selectedTextColor = Color.Black,
                        unselectedTextColor = Color.Black,
                        indicatorColor = Color(0xFFFFE580)
                    )
                )

                // === Item Registros ===
                NavigationBarItem(
                    icon = {
                        Icon(
                            imageVector = Icons.Default.Bookmark,
                            contentDescription = "Registros"
                        )
                    },
                    label = { Text("Registros", fontSize = 12.sp) },
                    selected = currentScreen == "registros",
                    onClick = { currentScreen = "registros" },
                    colors = NavigationBarItemDefaults.colors(
                        selectedIconColor = Color.Black,
                        unselectedIconColor = Color.Black,
                        selectedTextColor = Color.Black,
                        unselectedTextColor = Color.Black,
                        indicatorColor = Color(0xFFFFE580)
                    )
                )
            }
        }
    ) { innerPadding ->
        Surface(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
        ) {
            when (currentScreen) {
                "perfil" -> ProfileScreenMetrica()
                "habitos" -> HabitsScreenMetrica()
                "registros" -> RecordsScreenMetrica()
                "peso_altura" -> WeightHeightScreenMetrica()
                else -> WeightHeightScreenMetrica()
            }
        }
    }
}

@Composable
fun WeightHeightScreenMetrica() {
    var weight by remember { mutableStateOf("") }
    var selectedPeriod by remember { mutableStateOf("Semana") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(80.dp)
                .background(YellowSoft),
            contentAlignment = Alignment.Center
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Icon(
                    imageVector = Icons.Default.List,
                    contentDescription = "Menú",
                    tint = Color.Black,
                    modifier = Modifier.size(40.dp)
                )

                Text(
                    text = "    Ser+ Vita",
                    color = GreenAccent,
                    fontSize = 40.sp,
                    fontFamily = GreatVibes,
                    fontWeight = FontWeight.Bold,  // En lugar de fuente personalizada
                    textAlign = TextAlign.Center,
                    modifier = Modifier.weight(1f)
                )

                Spacer(modifier = Modifier.size(30.dp))
            }
        }

        Spacer(modifier = Modifier.height(12.dp))

        Text(
            text = "Métricas Fisiológicas",
            color = TextColor,
            fontSize = 27.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(horizontal = 8.dp)
        )

        Spacer(modifier = Modifier.height(15.dp))

        Divider(
            color = Color.Black,
            thickness = 1.dp,
            modifier = Modifier
                .width(328.dp)
                .align(Alignment.CenterHorizontally)
                .padding(vertical = 8.dp)
        )

        Spacer(modifier = Modifier.height(15.dp))

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 32.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            // Primer Box - Índice de masa corporal
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(60.dp)
                    .border(2.dp, YellowBorder, RoundedCornerShape(10.dp))
                    .background(Color(0xFFFEF7DD), RoundedCornerShape(10.dp))
                    .padding(horizontal = 12.dp)
            ) {
                Row(
                    modifier = Modifier.fillMaxSize(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = "Índice de masa corporal",
                        color = TextColor,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.SemiBold
                    )

                    Button(
                        onClick = { /* acción */ },
                        modifier = Modifier
                            .height(32.dp)
                            .width(50.dp),
                        shape = RoundedCornerShape(6.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0xFFF2E1A1)
                        )
                    ) {
                        Text(
                            text = "IR",
                            fontSize = 14.sp,
                            color = TextColor,
                            fontWeight = FontWeight.Bold
                        )
                    }
                }
            }

            // Segundo Box - Tasa Metabólica Basal
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(60.dp)
                    .border(2.dp, YellowBorder, RoundedCornerShape(10.dp))
                    .background(Color(0xFFFEF7DD), RoundedCornerShape(10.dp))
                    .padding(horizontal = 12.dp)
            ) {
                Row(
                    modifier = Modifier.fillMaxSize(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = "Tasa Metabólica Basal",
                        color = TextColor,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.SemiBold
                    )

                    Button(
                        onClick = { /* acción */ },
                        modifier = Modifier
                            .height(32.dp)
                            .width(50.dp),
                        shape = RoundedCornerShape(6.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0xFFF2E1A1)
                        )
                    ) {
                        Text(
                            text = "IR",
                            fontSize = 14.sp,
                            color = TextColor,
                            fontWeight = FontWeight.Bold
                        )
                    }
                }
            }

            // Tercer Box - Nivel de Actividad Física
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(60.dp)
                    .border(2.dp, YellowBorder, RoundedCornerShape(10.dp))
                    .background(Color(0xFFFEF7DD), RoundedCornerShape(10.dp))
                    .padding(horizontal = 12.dp)
            ) {
                Row(
                    modifier = Modifier.fillMaxSize(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = "Nivel de Actividad Física",
                        color = TextColor,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.SemiBold
                    )

                    Button(
                        onClick = { /* acción */ },
                        modifier = Modifier
                            .height(32.dp)
                            .width(50.dp),
                        shape = RoundedCornerShape(6.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0xFFF2E1A1)
                        )
                    ) {
                        Text(
                            text = "IR",
                            fontSize = 14.sp,
                            color = TextColor,
                            fontWeight = FontWeight.Bold
                        )
                    }
                }
            }
        }

        Spacer(modifier = Modifier.height(20.dp))
    }
}

@Composable
fun ProfileScreenMetrica() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(80.dp)
                    .background(YellowSoft),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "Vita",
                    color = GreenAccent,
                    fontSize = 56.sp,
                    fontWeight = FontWeight.Bold,  // Sin fuente personalizada
                    textAlign = TextAlign.Center
                )
            }

            Text(
                text = "Pantalla de Perfil",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = TextColor
            )
        }
    }
}

@Composable
fun HabitsScreenMetrica() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(80.dp)
                    .background(YellowSoft),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "Vita",
                    color = GreenAccent,
                    fontSize = 56.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center
                )
            }

            Text(
                text = "Pantalla de Hábitos",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = TextColor
            )
        }
    }
}

@Composable
fun RecordsScreenMetrica() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(80.dp)
                    .background(YellowSoft),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "Vita",
                    color = GreenAccent,
                    fontSize = 56.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center
                )
            }

            Text(
                text = "Pantalla de Registros",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = TextColor
            )
        }
    }
}

// Preview sin ServitaTheme
@Preview(showBackground = true)
@Composable
fun MainAppMetricaPreview() {
    MainAppMetrica()  // Llamada directa sin tema
}

// Previews individuales para testing
@Preview(showBackground = true)
@Composable
fun WeightHeightScreenMetricaPreview() {
    WeightHeightScreenMetrica()
}

@Preview(showBackground = true)
@Composable
fun ProfileScreenMetricaPreview() {
    ProfileScreenMetrica()
}
