package com.example.eva3m.service

import com.example.eva3m.modelo.Pago
import com.example.eva3m.repository.PagoRepository
import org.springframework.stereotype.Service

@Service
class PagoService {
 lateinit var pagoRepository: PagoRepository

    fun save (pago: Pago):Pago?{
        return pagoRepository.save(pago)
    }
    fun formatoPlaca(placa:String):Boolean{
        // El cuarto caracter siempre es "-"
        // No debe tener mas de ocho caracteres
        return true
    }

    fun getProvincia(placa:String):String{
        return "A"
    }

    fun getPagoBase(placa:String ):Long{
        //getProvincia()
        //if (provincia=="A")
              //return 50
        return 65
    }

    fun getPagoContaminacion(placa:String, anio: Long ):Long{
        //val pagoBase=getPagoBase()
        //if ((2022-anio) > 5)
        //return pagoBase+10
        return 75
    }
}