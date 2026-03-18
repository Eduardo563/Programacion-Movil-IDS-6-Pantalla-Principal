package com.example.pantallaprincipal.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button

import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier

import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.pantallaprincipal.components.Contact


@Composable
fun ListScreen(navController: NavController){
    val contacts = listOf( Pair("Juan", "6121714294"))

    val contactsList = remember{ mutableStateListOf<Pair<String,String>>() }
    var name by remember { mutableStateOf("") }
    var phone by remember {mutableStateOf("")}

    Column(modifier = Modifier.fillMaxSize()) {
        Text(
            text = "New Contact"
        )
        Text("Name", modifier = Modifier.padding(start = 12.dp))
        OutlinedTextField(
            value = name,
            onValueChange = {
                name = it }
        )
        Text("Phone", modifier = Modifier.padding(start = 12.dp))
        OutlinedTextField(
            value = phone,
            onValueChange = {
                phone = it }
        )

        Row(modifier = Modifier.padding(vertical=8.dp)) {
            Button(onClick = {}) {
                Text(text="Agregar")
            }
        }
    }


    LazyColumn {
        items(contacts){
            contact ->
            Contact(name = contact.first, phone = contact.second)

            //contactsList.add(Pair(name,phone))
        }
    }

}

@Preview
@Composable
fun ListScreenPreview(){
    val navController = rememberNavController()
    ListScreen(navController)
}