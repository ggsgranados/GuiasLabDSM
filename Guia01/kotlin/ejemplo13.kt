import java.time.LocalDate
import java.time.Period
import java.time.format.DateTimeFormatter

open class Persona (
    var nombre: String,
    var apellidos: String,
    var direccion: String,
    var telefono: String?,
    var fechaNacimientoTexto: String
){
    var fechaNacimientoDate: LocalDate = LocalDate.parse(fechaNacimientoTexto,DateTimeFormatter.ofPattern(FORMATO_FECHA))

    fun obtenerEdad(): Int{
        return Period.between(fechaNacimientoDate,LocalDate.now()).years
    }

    fun obtenerNombre(): String{
        return nombre
    }

    fun obtenerApellidos(): String{
        return apellidos
    }

    fun obtenerDireccion(): String{
        return direccion
    }

    fun obtenerfechaNacimiento(): String{
        return fechaNacimientoTexto
    }

    companion object{
        const val FORMATO_FECHA = "dd/MM/yyyy"
    }

}

class Empleado(
    nombre: String,
    apellidos: String,
    direccion: String,
    telefono: String,
    fechaNacimientoTexto: String
) : Persona(nombre,apellidos,direccion,telefono,fechaNacimientoTexto){

}

fun main(args: Array<String>) {
    val persona = Persona("Walter Ovidio","Sanchez Campos","Colonia Los Abedules","00000000","20/02/1991")
    println(persona.obtenerNombre())
    println(persona.obtenerApellidos())
    println(persona.obtenerDireccion())
    println(persona.obtenerfechaNacimiento())
    println(persona.obtenerEdad())
    val empleado = Persona("Jaime David","Campos Sanchez","Colonia Los Abedules","00000000","20/02/1995")
    println(empleado.obtenerNombre())
    println(empleado.obtenerApellidos())
    println(empleado.obtenerDireccion())
    println(empleado.obtenerfechaNacimiento())
    println(empleado.obtenerEdad())

}