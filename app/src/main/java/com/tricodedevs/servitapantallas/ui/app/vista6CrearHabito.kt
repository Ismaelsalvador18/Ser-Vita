package com.tricodedevs.servitapantallas.ui.app

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBars
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import com.tricodedevs.servita.ui.theme.Color_Background_App
import com.tricodedevs.servita.ui.theme.Color_Contorno_Base

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.EditNote
import androidx.compose.material.icons.filled.FormatListNumbered
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.Dimension
import com.tricodedevs.servita.ui.theme.*

@Composable
fun VistaCrearHabito() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color_Background_App)
    ) {
        ConstraintLayout(
            modifier = Modifier
                .fillMaxSize()
                .padding(WindowInsets.statusBars.asPaddingValues())
        ) {
            val (barraSuperior, contenidoCentral, barraInferior) = createRefs()

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(80.dp)
                    .background(Color_Contorno_Base)
                    .constrainAs(barraSuperior) {
                        top.linkTo(parent.top)
                    }
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(start = 16.dp, end = 50.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Icon(
                        imageVector = Icons.Filled.Menu,
                        contentDescription = "Menú",
                        tint = Texto_Principal,
                        modifier = Modifier.size(28.dp)
                    )
                    Text(
                        text = "Ser+ Vita",
                        color = Texto_Principal,
                        fontSize = 36.sp,
                        textAlign = TextAlign.End
                    )
                }
            }

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .constrainAs(contenidoCentral) {
                        top.linkTo(barraSuperior.bottom)
                        bottom.linkTo(barraInferior.top)
                        height = Dimension.fillToConstraints
                    }
                    .background(Color_Background_App)
                    .padding(horizontal = 16.dp)
            ) {
                Column(modifier = Modifier.fillMaxSize()) {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 24.dp),
                        contentAlignment = Alignment.CenterStart
                    ) {
                        Column(
                            horizontalAlignment = Alignment.Start,
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Text(
                                text = "Hábitos",
                                color = Texto_Principal,
                                fontSize = 26.sp,
                                fontWeight = FontWeight.Bold,
                                textAlign = TextAlign.Start
                            )
                            Spacer(
                                modifier = Modifier
                                    .padding(top = 6.dp)
                                    .height(2.dp)
                                    .fillMaxWidth()
                                    .background(Color_Contorno_Base)
                            )
                        }
                    }

                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .weight(1f)
                            .verticalScroll(rememberScrollState())
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(bottom = 16.dp)
                        ) {
                            Card(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(8.dp),
                                colors = CardDefaults.cardColors(containerColor = Color_Background_Seleccionado),
                                elevation = CardDefaults.cardElevation(defaultElevation = 6.dp),
                                shape = RoundedCornerShape(12.dp)
                            ) {
                                Column(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(16.dp),
                                    verticalArrangement = Arrangement.spacedBy(12.dp)
                                ) {
                                    var titulo by remember { mutableStateOf("") }
                                    var descripcion by remember { mutableStateOf("") }
                                    var recordatorio by remember { mutableStateOf("") }

                                    // CORRECCIÓN: Usar los parámetros correctos para OutlinedTextFieldDefaults.colors()
                                    val textFieldColors = OutlinedTextFieldDefaults.colors(
                                        focusedTextColor = Texto_Principal,
                                        unfocusedTextColor = Texto_Principal,
                                        focusedContainerColor = Color.Transparent,
                                        unfocusedContainerColor = Color.Transparent,
                                        focusedBorderColor = Color.Transparent,
                                        unfocusedBorderColor = Color.Transparent,
                                        cursorColor = Texto_Principal,
                                        focusedPlaceholderColor = Texto_Secundario,
                                        unfocusedPlaceholderColor = Texto_Secundario
                                    )

                                    // Título
                                    Text(
                                        text = "Título",
                                        fontSize = 16.sp,
                                        fontWeight = FontWeight.Bold,
                                        color = Texto_Principal
                                    )
                                    Box(
                                        modifier = Modifier
                                            .height(56.dp)
                                            .background(
                                                color = Color_Background_App,
                                                shape = RoundedCornerShape(5.dp)
                                            )
                                            .border(
                                                width = 1.dp,
                                                color = Color_Background_App,
                                                shape = RoundedCornerShape(5.dp)
                                            ),
                                        contentAlignment = Alignment.CenterStart
                                    ) {
                                        OutlinedTextField(
                                            value = titulo,
                                            onValueChange = { titulo = it },
                                            placeholder = { Text("Ingrese el título") },
                                            modifier = Modifier.fillMaxWidth(),
                                            colors = textFieldColors
                                        )
                                    }

                                    // Descripción
                                    Text(
                                        text = "Descripción",
                                        fontSize = 16.sp,
                                        fontWeight = FontWeight.Bold,
                                        color = Texto_Principal
                                    )
                                    Box(
                                        modifier = Modifier
                                            .height(56.dp)
                                            .background(
                                                color = Color_Background_App,
                                                shape = RoundedCornerShape(5.dp)
                                            )
                                            .border(
                                                width = 1.dp,
                                                color = Color_Background_App,
                                                shape = RoundedCornerShape(5.dp)
                                            ),
                                        contentAlignment = Alignment.CenterStart
                                    ) {
                                        OutlinedTextField(
                                            value = descripcion,
                                            onValueChange = { descripcion = it },
                                            placeholder = { Text("Ingrese la descripción") },
                                            modifier = Modifier.fillMaxWidth(),
                                            colors = textFieldColors
                                        )
                                    }

                                    // Recordatorio
                                    Text(
                                        text = "Recordatorio",
                                        fontSize = 16.sp,
                                        fontWeight = FontWeight.Bold,
                                        color = Texto_Principal
                                    )
                                    Box(
                                        modifier = Modifier
                                            .height(56.dp)
                                            .background(
                                                color = Color_Background_App,
                                                shape = RoundedCornerShape(5.dp)
                                            )
                                            .border(
                                                width = 1.dp,
                                                color = Color_Background_App,
                                                shape = RoundedCornerShape(5.dp)
                                            ),
                                        contentAlignment = Alignment.CenterStart
                                    ) {
                                        OutlinedTextField(
                                            value = recordatorio,
                                            onValueChange = { recordatorio = it },
                                            placeholder = { Text("Ingrese recordatorio") },
                                            modifier = Modifier.fillMaxWidth(),
                                            colors = textFieldColors
                                        )
                                    }

                                    Spacer(modifier = Modifier.height(12.dp))

                                    Box(
                                        modifier = Modifier
                                            .fillMaxWidth(),
                                        contentAlignment = Alignment.Center
                                    ) {
                                        Button(
                                            onClick = {
                                                // Lógica para guardar el hábito
                                            },
                                            modifier = Modifier
                                                .fillMaxWidth(0.6f)
                                                .height(48.dp),
                                            shape = RoundedCornerShape(8.dp),
                                            colors = ButtonDefaults.buttonColors(
                                                containerColor = Color_Contorno_Completado
                                            )
                                        ) {
                                            Text(
                                                text = "Guardar",
                                                fontSize = 16.sp,
                                                fontWeight = FontWeight.Bold,
                                                color = Texto_Principal
                                            )
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }

            // Barra inferior
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(80.dp)
                    .background(Color.White)
                    .constrainAs(barraInferior) {
                        bottom.linkTo(parent.bottom)
                    }
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(1.dp)
                        .background(Color(0xFFBDBDBD))
                        .align(Alignment.TopCenter)
                )

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp, vertical = 8.dp),
                    horizontalArrangement = Arrangement.SpaceAround,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Icon(
                            imageVector = Icons.Filled.Person,
                            contentDescription = "Perfil",
                            tint = Texto_Principal,
                            modifier = Modifier.size(28.dp)
                        )
                        Text("Perfil", fontSize = 14.sp, color = Texto_Principal)
                    }

                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Icon(
                            imageVector = Icons.Filled.FormatListNumbered,
                            contentDescription = "Hábitos",
                            tint = Texto_Principal,
                            modifier = Modifier.size(28.dp)
                        )
                        Text("Hábitos", fontSize = 14.sp, color = Texto_Principal)
                    }

                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Icon(
                            imageVector = Icons.Filled.EditNote,
                            contentDescription = "Registros",
                            tint = Texto_Principal,
                            modifier = Modifier.size(28.dp)
                        )
                        Text("Registros", fontSize = 14.sp, color = Texto_Principal)
                    }
                }
            }
        }
    }
}