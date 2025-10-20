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
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.CheckBox
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.EditNote
import androidx.compose.material.icons.filled.FormatListNumbered
import androidx.compose.material.icons.filled.Language
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.WbSunny
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.Dimension
import com.tricodedevs.servita.ui.theme.*


@Preview
@Composable
fun VistaAcerdaDe() {
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
                                text = "Acerca de ..",
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
                    ) {
                        Column(
                            modifier = Modifier.fillMaxSize().padding(horizontal = 5.dp),
                            verticalArrangement = Arrangement.SpaceEvenly,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {

                            Text(
                                text = "Somos",
                                fontSize = 20.sp,
                                color = Texto_Principal,
                                lineHeight = 24.sp
                            )

                            Text(
                                text = "Ser+ Vita",
                                color = Texto_Principal,
                                fontSize = 42.sp,
                                textAlign = TextAlign.End
                            )

                            Text(
                                text = "apasionados por la tecnología, el bienestar " +
                                        "y la mejora personal. La app es un proyecto " +
                                        "independiente con el fin de: ayudar a " +
                                        "personas a mantener hábitos saludables " +
                                        "de forma simple, visual y motivadora.\n",
                                fontSize = 20.sp,
                                color = Texto_Principal,
                                textAlign = TextAlign.Center,
                                lineHeight = 24.sp
                            )

                            Text(
                                text = "¿Qué hace la app?\n",
                                fontSize = 24.sp,
                                fontWeight = FontWeight.Bold,
                                color = Texto_Principal,
                                textAlign = TextAlign.Center,
                                lineHeight = 24.sp
                            )

                            Text(
                                text = "Es una herramienta ligera y amigable para " +
                                        "el día a día, siguiendo tus hábitos, con " +
                                        "hasta recordatorios suaves y " +
                                        "visualizaciones de progreso, todo está " +
                                        "diseñado para que empieces tu cambio, y " +
                                        "este sea sostenible y positivo.",
                                fontSize = 20.sp,
                                color = Texto_Principal,
                                textAlign = TextAlign.Center,
                                lineHeight = 24.sp
                            )

                            Spacer(Modifier.fillMaxWidth().height(3.dp).background(Texto_Secundario))

                            Box(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(70.dp)
                                    .padding(horizontal = 20.dp),
                                contentAlignment = Alignment.Center
                            ) {
                                Text(
                                    text = "Contáctanos\n" +
                                            "CorreoProfesional@gmai.com",
                                    fontSize = 16.sp,
                                    color = Texto_Secundario,
                                    textAlign = TextAlign.Center,
                                    lineHeight = 20.sp
                                )
                            }
                        }
                    }

                }
            }

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