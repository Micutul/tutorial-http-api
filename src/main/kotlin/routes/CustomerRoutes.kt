package com.example.routes

import com.example.models.*
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.customerRouting(){
    route("/cutomer"){
        get {
            if (customerStorage.isNotEmpty()){
                call.respond(customerStorage)
            }
            else{
                call.respondText("No customer found", status = HttpStatusCode.OK)

            }
        }
    }
}
