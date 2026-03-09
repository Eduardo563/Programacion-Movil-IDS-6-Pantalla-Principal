package com.example.pantallaprincipal.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Arrangement.Center
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.pantallaprincipal.R


@Composable
fun LoginScreen(navController: NavController){
    Box(
        modifier = Modifier.background(Color(0xff4f4ab1))
    ){
        Column(
            verticalArrangement = Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier  = Modifier
                .padding(16.dp)
                .clip(RoundedCornerShape(12))
                .background(Color(0xFFFFFFFF))
        ){
            Image(
                painter  = painterResource(id = R.drawable.login_access),
                contentDescription = null,
                modifier = Modifier.size(300.dp)
            )
            Column(
                verticalArrangement = Arrangement.spacedBy(12.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.padding(horizontal = 12.dp, vertical = 18.dp)){
                Text("Login",
                    fontFamily = FontFamily.SansSerif,
                    fontWeight = FontWeight.Bold,
                    fontSize = 40.sp)
            }
            Column(
                verticalArrangement = Arrangement.spacedBy(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.padding(12.dp)) {

                Column(
                    verticalArrangement = Center,
                    horizontalAlignment = Alignment.Start
                ) {
                    Text("Name", modifier = Modifier.padding(start = 12.dp))
                    var name by remember { mutableStateOf("")}
                    OutlinedTextField(
                        value = name,
                        onValueChange = {name = it}
                    )
                }
                Column(
                    verticalArrangement = Center,
                    horizontalAlignment = Alignment.Start
                ) {
                    Text("Email", modifier = Modifier.padding(start = 12.dp))
                    var email by remember { mutableStateOf("")}
                    OutlinedTextField(
                        value = email,
                        onValueChange = {email = it}
                    )
                }
                Column(
                    verticalArrangement = Center,
                    horizontalAlignment = Alignment.Start
                ) {
                    Text("Password", modifier = Modifier.padding(start = 12.dp))
                    var password by remember { mutableStateOf("")}
                    OutlinedTextField(
                        value = password,
                        onValueChange = {password = it},
                        visualTransformation = PasswordVisualTransformation()
                    )
                }

                Column(
                    verticalArrangement = Center,
                    horizontalAlignment = Alignment.Start,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text("Forgot password?", modifier = Modifier.padding(start = 30.dp),
                        color = Color(0xFF555555),
                        fontSize = 12.sp)
                }

                Column(
                    verticalArrangement = Center,
                    horizontalAlignment = Alignment.End,
                    modifier = Modifier
                        .padding(end = 35.dp, bottom = 14.dp)
                        .fillMaxWidth()) {

                    Row(
                        horizontalArrangement = Arrangement.spacedBy(16.dp)
                    ){
                        OutlinedButton( onClick = {
                            navController.navigate("welcome")
                        },
                            modifier = Modifier.size(width = 125.dp, height = 50.dp),
                            border = BorderStroke(2.dp, Color(0xff4f4ab1)),
                        ) {
                            Text("Cancel",
                                fontWeight = FontWeight.Bold,
                                fontSize = 18.sp)
                        }
                        Button( onClick = {},
                            modifier = Modifier.size(width = 125.dp, height = 50.dp),
                            colors = ButtonDefaults.buttonColors(Color(0xff4f4ab1)),
                        ) {
                            Text("Sign In",
                                fontWeight = FontWeight.Bold,
                                fontSize = 18.sp)
                        }
                    }

                }
            }

        }
    }
}
@Composable
@Preview (showBackground = true, showSystemUi = false)
fun LoginScreenPreview(){

    val navController = rememberNavController()
    LoginScreen(navController = navController)

}