"""Definimos nuestros atributos de clase"""

class moto():

    marca = "Ducatti" , color = "Verde cielo", modelo = "2016"
    precio = 12000000
    
#Voy a exponer la moto que voy a crear instanciando la clase o creando un objeto
    motoA = moto()
    println("Estas son las caracteristicas de mi moto: Moto A ")
    println()
    println("Esta es la marca de mi moto: ",motoA.marca)
    println("Este es el color de mi moto: ", motoA.color)
    println("Este es el modelo de mi moto: ",motoA.modelo)
        
    motoB = moto()
    motoB.marca = "kimko"
    motoB.color = "Verde"
    motoB.modelo = "2010"
    motoB.precio = 22000000
        
    println("Estas son las caracteristicas de mi moto: Moto B ")
    println()
    println("Esta es la marca de mi moto: ",motoB.marca)
    println("Este es el color de mi moto: ", motoB.color)
    println("Este es el modelo de mi moto: ",motoB.modelo)
        
    motoC = moto()
    motoC.marca = "AKT"
    motoC.color = "Azul" 
    motoC.modelo = "2010" 
    motoC.precio = 33000000
    println("Estas son las caracteristicas de mi moto: Moto C ")
    println();
    println("Esta es la marca de mi moto: " , motoC.marca)
    println("Este es el color de mi moto: ",motoC.color)
    println("Este es el modelo de mi moto: ",motoC.modelo)
        
    motoD= moto()
    motoD.marca = "Yamaha"
    motoD.color = "Negra" 
    motoD.modelo = "2015" 
    motoD.precio = 35000000
    println("Estas son las caracteristicas de mi moto: Moto D ")
    println();
    println("Esta es la marca de mi moto: " , motoD.marca)
    println("Este es el color de mi moto: ",motoD.color)
    println("Este es el modelo de mi moto: ",motoD.modelo)