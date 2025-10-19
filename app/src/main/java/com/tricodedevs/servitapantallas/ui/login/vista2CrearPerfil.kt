package com.tricodedevs.servita.ui.theme.ui.login

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.tricodedevs.servita.ui.theme.*


@Composable
fun VistaRegistrarDatos() {

    var nombre by remember { mutableStateOf("") }
    var edad by remember { mutableStateOf("") }
    var altura by remember { mutableStateOf("") }
    var peso by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color_Background_App)
            .padding(
                top = 48.dp,
                bottom = 100.dp,
                start = 48.dp,
                end = 48.dp
            ),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .width(300.dp)
                .height(100.dp),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "Ser+ Vita",
                style = MaterialTheme.typography.titleLarge,
                color = Texto_Principal,
                fontSize = 48.sp
            )
        }

        Spacer(modifier = Modifier.height(32.dp))

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .background(
                    color = Color_Background_Box,
                    shape = RoundedCornerShape(20.dp)
                )
                .border(
                    width = 3.dp,
                    color = Color_Contorno_Base,
                    shape = RoundedCornerShape(20.dp)
                )
                .padding(24.dp)
        ) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(
                    text = "Empieza estableciendo tus datos, tu nombre será el que se mostrara al seleccionar perfil. Luego podrás cambiarlos.",
                    style = MaterialTheme.typography.bodyMedium,
                    fontSize = 14.sp,
                    color = Texto_Principal,
                    textAlign = TextAlign.Center
                )
                Spacer(modifier = Modifier.height(24.dp))

                Column(
                    modifier = Modifier.fillMaxHeight(),
                    verticalArrangement = Arrangement.spacedBy(16.dp)
                ) {

                    // LABEL Y CAMPO DEL NOMBRE
                    Row(
                        modifier = Modifier
                            .fillMaxSize()
                            .weight(1f),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            modifier = Modifier.weight(1f),
                            text = "Nombre:",
                            style = MaterialTheme.typography.titleMedium,
                            fontSize = 20.sp,
                            color = Texto_Principal,
                            textAlign = TextAlign.Start
                        )

                        Box(
                            modifier = Modifier
                                .weight(1f)
                                .height(40.dp)
                                .background(color = Color_Background_App)
                                .border(
                                    width = 1.dp,
                                    color = Color_Contorno_Por_Completar
                                ),
                            contentAlignment = Alignment.CenterStart
                        ) {
                            BasicTextField(
                                value = nombre,
                                onValueChange = { nuevo -> nombre = nuevo },
                                singleLine = true,
                                textStyle = MaterialTheme.typography.bodyMedium.copy(
                                    fontSize = 14.sp,
                                    color = Texto_Principal,
                                ),
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(horizontal = 8.dp)
                            )
                        }
                    }

                    // LABEL Y CAMPO DE LA EDAD
                    Row(
                        modifier = Modifier
                            .fillMaxSize()
                            .weight(1f),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            modifier = Modifier.weight(1f),
                            text = "Edad:",
                            style = MaterialTheme.typography.titleMedium,
                            fontSize = 20.sp,
                            color = Texto_Principal,
                            textAlign = TextAlign.Start
                        )

                        Box(
                            modifier = Modifier
                                .weight(1f)
                                .height(40.dp)
                                .background(color = Color_Background_App)
                                .border(
                                    width = 1.dp,
                                    color = Color_Contorno_Por_Completar
                                ),
                            contentAlignment = Alignment.CenterStart
                        ) {
                            BasicTextField(
                                value = edad,
                                onValueChange = { nuevo -> edad = nuevo },
                                singleLine = true,
                                textStyle = MaterialTheme.typography.bodyMedium.copy(
                                    fontSize = 14.sp,
                                    color = Texto_Principal,
                                ),
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(horizontal = 8.dp)
                            )
                        }
                    }

                    // LABEL  Y CAMPO DE LA ALTURA
                    Row(
                        modifier = Modifier
                            .fillMaxSize()
                            .weight(1f),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            modifier = Modifier.weight(1f),
                            text = "Altura:",
                            style = MaterialTheme.typography.titleMedium,
                            fontSize = 20.sp,
                            color = Texto_Principal,
                            textAlign = TextAlign.Start
                        )

                        Box(
                            modifier = Modifier
                                .weight(1f)
                                .height(40.dp)
                                .background(color = Color_Background_App)
                                .border(
                                    width = 1.dp,
                                    color = Color_Contorno_Por_Completar
                                ),
                            contentAlignment = Alignment.CenterStart
                        ) {
                            BasicTextField(
                                value = altura,
                                onValueChange = { nuevo -> altura = nuevo },
                                singleLine = true,
                                textStyle = MaterialTheme.typography.bodyMedium.copy(
                                    fontSize = 14.sp,
                                    color = Texto_Principal,
                                ),
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(horizontal = 8.dp)
                            )
                        }
                    }

                    // LABEL Y CAMPO PARA EL PESO
                    Row(
                        modifier = Modifier
                            .fillMaxSize()
                            .weight(1f),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            modifier = Modifier.weight(1f),
                            text = "Peso:",
                            style = MaterialTheme.typography.titleMedium,
                            fontSize = 20.sp,
                            color = Texto_Principal,
                            textAlign = TextAlign.Start
                        )

                        Box(
                            modifier = Modifier
                                .weight(1f)
                                .height(40.dp)
                                .background(color = Color_Background_App)
                                .border(
                                    width = 1.dp,
                                    color = Color_Contorno_Por_Completar
                                ),
                            contentAlignment = Alignment.CenterStart
                        ) {
                            BasicTextField(
                                value = peso,
                                onValueChange = { nuevo -> peso = nuevo },
                                singleLine = true,
                                textStyle = MaterialTheme.typography.bodyMedium.copy(
                                    fontSize = 14.sp,
                                    color = Texto_Principal,
                                ),
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(horizontal = 8.dp)
                            )
                        }
                    }

                    // BOTÓN VISUAL (sin lógica)
                    Card(
                        modifier = Modifier
                            .fillMaxWidth(0.7f)
                            .height(70.dp)
                            .padding(8.dp)
                            .align(Alignment.CenterHorizontally),
                        colors = CardDefaults.cardColors(
                            containerColor = Color_Background_Seleccionado
                        ),
                        elevation = CardDefaults.cardElevation(defaultElevation = 6.dp),
                        shape = RoundedCornerShape(5.dp)
                    ) {
                        Box(
                            modifier = Modifier.fillMaxSize(),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = "Crear",
                                style = MaterialTheme.typography.titleMedium,
                                fontSize = 24.sp,
                                textAlign = TextAlign.Center
                            )
                        }
                    }
                }
            }
        }
    }
}
