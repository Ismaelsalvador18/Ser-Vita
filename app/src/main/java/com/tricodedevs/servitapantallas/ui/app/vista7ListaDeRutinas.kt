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
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.CheckBox
import androidx.compose.material.icons.filled.CheckCircle
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
fun VistaRutinas() {
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

            // Barra superior
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
                                    .height(200.dp)
                                    .padding(8.dp)
                                    .border(
                                        width = 2.dp,
                                        color = Color_Contorno_Base,
                                        shape = RoundedCornerShape(12.dp)
                                    ),
                                colors = CardDefaults.cardColors(containerColor = Color_Background_Seleccionado),
                                elevation = CardDefaults.cardElevation(defaultElevation = 6.dp),
                                shape = RoundedCornerShape(12.dp)
                            ) {
                                ConstraintLayout(modifier = Modifier.fillMaxSize().padding(16.dp)) {

                                    val (titulo, descripcion, iconoSuperior, iconoInferior) = createRefs()

                                    Text(
                                        text = "Agua",
                                        color = Texto_Principal,
                                        fontSize = 26.sp,
                                        fontWeight = FontWeight.Bold,
                                        modifier = Modifier.constrainAs(titulo) {
                                            top.linkTo(parent.top)
                                            start.linkTo(parent.start)
                                        }
                                    )

                                    Icon(
                                        imageVector = Icons.Filled.Menu,
                                        contentDescription = "Opciones",
                                        tint = Texto_Principal,
                                        modifier = Modifier
                                            .size(32.dp)
                                            .constrainAs(iconoSuperior) {
                                                top.linkTo(parent.top)
                                                end.linkTo(parent.end)
                                            }
                                    )

                                    Icon(
                                        imageVector = Icons.Filled.CheckCircle,
                                        contentDescription = "Completado",
                                        tint = Color_Contorno_Completado,
                                        modifier = Modifier
                                            .size(32.dp)
                                            .constrainAs(iconoInferior) {
                                                bottom.linkTo(parent.bottom)
                                                end.linkTo(parent.end)
                                            }
                                    )

                                    Box(
                                        modifier = Modifier.constrainAs(descripcion) {
                                            top.linkTo(titulo.bottom, margin = 8.dp)
                                            bottom.linkTo(parent.bottom, margin = 8.dp)
                                            start.linkTo(parent.start)
                                            end.linkTo(iconoInferior.start, margin = 8.dp)
                                            width = Dimension.fillToConstraints
                                            height = Dimension.fillToConstraints
                                        },
                                        contentAlignment = Alignment.Center
                                    ) {
                                        Text(
                                            text = "3 litros de agua",
                                            color = Texto_Principal,
                                            fontSize = 32.sp,
                                            fontWeight = FontWeight.Normal
                                        )
                                    }

                                }
                            }


                            Card(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(200.dp)
                                    .padding(8.dp)
                                    .border(
                                        width = 2.dp,
                                        color = Color_Contorno_Completado,
                                        shape = RoundedCornerShape(12.dp)
                                    ),
                                colors = CardDefaults.cardColors(containerColor = Color_Background_Completado),
                                elevation = CardDefaults.cardElevation(defaultElevation = 6.dp),
                                shape = RoundedCornerShape(12.dp)
                            ) {
                                ConstraintLayout(modifier = Modifier.fillMaxSize().padding(16.dp)) {

                                    val (titulo, descripcion, iconoSuperior, iconoInferior) = createRefs()

                                    Text(
                                        text = "Ejercicio",
                                        color = Texto_Principal,
                                        fontSize = 26.sp,
                                        fontWeight = FontWeight.Bold,
                                        modifier = Modifier.constrainAs(titulo) {
                                            top.linkTo(parent.top)
                                            start.linkTo(parent.start)
                                        }
                                    )

                                    Icon(
                                        imageVector = Icons.Filled.Menu,
                                        contentDescription = "Opciones",
                                        tint = Texto_Principal,
                                        modifier = Modifier
                                            .size(32.dp)
                                            .constrainAs(iconoSuperior) {
                                                top.linkTo(parent.top)
                                                end.linkTo(parent.end)
                                            }
                                    )

                                    Box(
                                        modifier = Modifier.constrainAs(descripcion) {
                                            top.linkTo(titulo.bottom, margin = 8.dp)
                                            bottom.linkTo(parent.bottom, margin = 8.dp)
                                            start.linkTo(parent.start)
                                            end.linkTo(parent.end, margin = 8.dp)
                                            width = Dimension.fillToConstraints
                                            height = Dimension.fillToConstraints
                                        },
                                        contentAlignment = Alignment.BottomEnd
                                    ) {
                                        Box(
                                            modifier = Modifier
                                                .background(
                                                    color = Color_Contorno_Completado,
                                                    shape = RoundedCornerShape(10.dp)
                                                )
                                                .padding(
                                                    horizontal = 20.dp,
                                                    vertical = 10.dp
                                                )


                                        ) {
                                            Text(
                                                text = "Completado",
                                                color = Texto_Principal,
                                                fontSize = 20.sp,
                                                fontWeight = FontWeight.Bold
                                            )
                                        }
                                    }

                                }
                            }


                            Card(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(200.dp)
                                    .padding(8.dp)
                                    .border(
                                        width = 2.dp,
                                        color = Color_Contorno_Base,
                                        shape = RoundedCornerShape(12.dp)
                                    ),
                                colors = CardDefaults.cardColors(containerColor = Color_Background_Seleccionado),
                                elevation = CardDefaults.cardElevation(defaultElevation = 6.dp),
                                shape = RoundedCornerShape(12.dp)
                            ) {
                                ConstraintLayout(modifier = Modifier.fillMaxSize().padding(16.dp)) {

                                    val (titulo, descripcion, iconoSuperior, iconoInferior) = createRefs()

                                    Text(
                                        text = "Sueño",
                                        color = Texto_Principal,
                                        fontSize = 26.sp,
                                        fontWeight = FontWeight.Bold,
                                        modifier = Modifier.constrainAs(titulo) {
                                            top.linkTo(parent.top)
                                            start.linkTo(parent.start)
                                        }
                                    )

                                    Icon(
                                        imageVector = Icons.Filled.Menu,
                                        contentDescription = "Opciones",
                                        tint = Texto_Principal,
                                        modifier = Modifier
                                            .size(32.dp)
                                            .constrainAs(iconoSuperior) {
                                                top.linkTo(parent.top)
                                                end.linkTo(parent.end)
                                            }
                                    )

                                    Icon(
                                        imageVector = Icons.Filled.CheckCircle,
                                        contentDescription = "Completado",
                                        tint = Color_Contorno_Completado,
                                        modifier = Modifier
                                            .size(32.dp)
                                            .constrainAs(iconoInferior) {
                                                bottom.linkTo(parent.bottom)
                                                end.linkTo(parent.end)
                                            }
                                    )

                                    Box(
                                        modifier = Modifier.constrainAs(descripcion) {
                                            top.linkTo(titulo.bottom, margin = 8.dp)
                                            bottom.linkTo(parent.bottom, margin = 8.dp)
                                            start.linkTo(parent.start)
                                            end.linkTo(iconoInferior.start, margin = 8.dp)
                                            width = Dimension.fillToConstraints
                                            height = Dimension.fillToConstraints
                                        },
                                        contentAlignment = Alignment.Center
                                    ) {
                                        Text(
                                            text = "8 horas de sueño",
                                            color = Texto_Principal,
                                            fontSize = 32.sp,
                                            fontWeight = FontWeight.Normal
                                        )
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