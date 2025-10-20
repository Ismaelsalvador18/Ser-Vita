package com.tricodedevs.servitapantallas.ui.registros

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
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import com.tricodedevs.servita.ui.theme.Color_Background_App
import com.tricodedevs.servita.ui.theme.Color_Contorno_Base

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.EditNote
import androidx.compose.material.icons.filled.FormatListNumbered
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.Dimension
import com.tricodedevs.servita.ui.theme.*

@Composable
fun VistaHistorialDeHabitos() {

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
                                text = "Registro de Habitos",
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
                                    .background(Texto_Principal)
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
                                .padding(bottom = 16.dp),
                            verticalArrangement = Arrangement.spacedBy(5.dp)
                        ) {

                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(50.dp)
                                    .padding(
                                        end = 20.dp,
                                        start = 40.dp
                                    ),
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.SpaceBetween
                            ) {
                                Text(
                                    text = "Ejercicio",
                                    fontSize = 20.sp,
                                    fontWeight = FontWeight.Normal,
                                    color = Color_Contorno_Completado,
                                    modifier = Modifier.weight(1f)
                                )

                                Spacer(Modifier.fillMaxHeight().width(15.dp))
                                Icon(
                                    imageVector = Icons.Filled.Check,
                                    contentDescription = "Completado",
                                    modifier = Modifier.size(24.dp),
                                    tint = Color_Contorno_Completado
                                )
                            }
                            Spacer(
                                Modifier.fillMaxWidth().height(2.dp)
                                    .background(Texto_Secundario)
                            )

                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(50.dp)
                                    .padding(
                                        end = 20.dp,
                                        start = 40.dp
                                    ),
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.SpaceBetween
                            ) {
                                Text(
                                    text = "Sueño",
                                    fontSize = 20.sp,
                                    fontWeight = FontWeight.Normal,
                                    color = Color_Contorno_Completado,
                                    modifier = Modifier.weight(1f)
                                )

                                Spacer(Modifier.fillMaxHeight().width(15.dp))
                                Icon(
                                    imageVector = Icons.Filled.Check,
                                    contentDescription = "Completado",
                                    modifier = Modifier.size(24.dp),
                                    tint = Color_Contorno_Completado
                                )
                            }
                            Spacer(
                                Modifier.fillMaxWidth().height(2.dp)
                                    .background(Texto_Secundario)
                            )

                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(50.dp)
                                    .padding(
                                        end = 20.dp,
                                        start = 40.dp
                                    ),
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.SpaceBetween
                            ) {
                                Text(
                                    text = "Meditación",
                                    fontSize = 20.sp,
                                    fontWeight = FontWeight.Normal,
                                    color = Color_Contorno_Completado,
                                    modifier = Modifier.weight(1f)
                                )

                                Spacer(Modifier.fillMaxHeight().width(15.dp))
                                Icon(
                                    imageVector = Icons.Filled.Check,
                                    contentDescription = "Completado",
                                    modifier = Modifier.size(24.dp),
                                    tint = Color_Contorno_Completado
                                )
                            }
                            Spacer(
                                Modifier.fillMaxWidth().height(2.dp)
                                    .background(Texto_Secundario)
                            )

                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(50.dp)
                                    .padding(
                                        end = 20.dp,
                                        start = 40.dp
                                    ),
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.SpaceBetween
                            ) {
                                Text(
                                    text = "Lectura",
                                    fontSize = 20.sp,
                                    fontWeight = FontWeight.Normal,
                                    color = Color_Boton_Precaucion,
                                    modifier = Modifier.weight(1f)
                                )

                                Spacer(Modifier.fillMaxHeight().width(15.dp))
                                Icon(
                                    imageVector = Icons.Filled.Close,
                                    contentDescription = "Incompleto",
                                    modifier = Modifier.size(24.dp),
                                    tint = Color_Boton_Precaucion
                                )
                            }
                            Spacer(
                                Modifier.fillMaxWidth().height(2.dp)
                                    .background(Texto_Secundario)
                            )

                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(50.dp)
                                    .padding(
                                        end = 20.dp,
                                        start = 40.dp
                                    ),
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.SpaceBetween
                            ) {
                                Text(
                                    text = "Ejercicio",
                                    fontSize = 20.sp,
                                    fontWeight = FontWeight.Normal,
                                    color = Color_Contorno_Completado,
                                    modifier = Modifier.weight(1f)
                                )

                                Spacer(Modifier.fillMaxHeight().width(15.dp))
                                Icon(
                                    imageVector = Icons.Filled.Check,
                                    contentDescription = "Completado",
                                    modifier = Modifier.size(24.dp),
                                    tint = Color_Contorno_Completado
                                )
                            }
                            Spacer(
                                Modifier.fillMaxWidth().height(2.dp)
                                    .background(Texto_Secundario)
                            )

                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(50.dp)
                                    .padding(
                                        end = 20.dp,
                                        start = 40.dp
                                    ),
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.SpaceBetween
                            ) {
                                Text(
                                    text = "Sueño",
                                    fontSize = 20.sp,
                                    fontWeight = FontWeight.Normal,
                                    color = Color_Contorno_Completado,
                                    modifier = Modifier.weight(1f)
                                )

                                Spacer(Modifier.fillMaxHeight().width(15.dp))
                                Icon(
                                    imageVector = Icons.Filled.Check,
                                    contentDescription = "Completado",
                                    modifier = Modifier.size(24.dp),
                                    tint = Color_Contorno_Completado
                                )
                            }
                            Spacer(
                                Modifier.fillMaxWidth().height(2.dp)
                                    .background(Texto_Secundario)
                            )

                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(50.dp)
                                    .padding(
                                        end = 20.dp,
                                        start = 40.dp
                                    ),
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.SpaceBetween
                            ) {
                                Text(
                                    text = "Meditación",
                                    fontSize = 20.sp,
                                    fontWeight = FontWeight.Normal,
                                    color = Color_Boton_Precaucion,
                                    modifier = Modifier.weight(1f)
                                )

                                Spacer(Modifier.fillMaxHeight().width(15.dp))
                                Icon(
                                    imageVector = Icons.Filled.Close,
                                    contentDescription = "Incompleto",
                                    modifier = Modifier.size(24.dp),
                                    tint = Color_Boton_Precaucion
                                )
                            }
                            Spacer(
                                Modifier.fillMaxWidth().height(2.dp)
                                    .background(Texto_Secundario)
                            )

                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(50.dp)
                                    .padding(
                                        end = 20.dp,
                                        start = 40.dp
                                    ),
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.SpaceBetween
                            ) {
                                Text(
                                    text = "Lectura",
                                    fontSize = 20.sp,
                                    fontWeight = FontWeight.Normal,
                                    color = Color_Contorno_Completado,
                                    modifier = Modifier.weight(1f)
                                )

                                Spacer(Modifier.fillMaxHeight().width(15.dp))
                                Icon(
                                    imageVector = Icons.Filled.Check,
                                    contentDescription = "Completado",
                                    modifier = Modifier.size(24.dp),
                                    tint = Color_Contorno_Completado
                                )
                            }
                            Spacer(
                                Modifier.fillMaxWidth().height(2.dp)
                                    .background(Texto_Secundario)
                            )

                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(50.dp)
                                    .padding(
                                        end = 20.dp,
                                        start = 40.dp
                                    ),
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.SpaceBetween
                            ) {
                                Text(
                                    text = "Ejercicio",
                                    fontSize = 20.sp,
                                    fontWeight = FontWeight.Normal,
                                    color = Color_Contorno_Completado,
                                    modifier = Modifier.weight(1f)
                                )

                                Spacer(Modifier.fillMaxHeight().width(15.dp))
                                Icon(
                                    imageVector = Icons.Filled.Check,
                                    contentDescription = "Completado",
                                    modifier = Modifier.size(24.dp),
                                    tint = Color_Contorno_Completado
                                )
                            }
                            Spacer(
                                Modifier.fillMaxWidth().height(2.dp)
                                    .background(Texto_Secundario)
                            )


                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(50.dp)
                                    .padding(
                                        end = 20.dp,
                                        start = 40.dp
                                    ),
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.SpaceBetween
                            ) {
                                Text(
                                    text = "Meditación",
                                    fontSize = 20.sp,
                                    fontWeight = FontWeight.Normal,
                                    color = Color_Boton_Precaucion,
                                    modifier = Modifier.weight(1f)
                                )

                                Spacer(Modifier.fillMaxHeight().width(15.dp))
                                Icon(
                                    imageVector = Icons.Filled.Close,
                                    contentDescription = "Incompleto",
                                    modifier = Modifier.size(24.dp),
                                    tint = Color_Boton_Precaucion
                                )
                            }
                            Spacer(
                                Modifier.fillMaxWidth().height(2.dp)
                                    .background(Texto_Secundario)
                            )
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