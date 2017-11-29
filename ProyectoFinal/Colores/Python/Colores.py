"""author: @LauraSantacruz"""

a = [11] #PrimeraListaDeColores
b = [11] #SegundaListaDeColores
c = [11] #TerceraListaDeColores
d = [11] #CuartaListaDeColores
        
 #Llenado de listas
        
for i in range(10)
    println("Primera lista de colores ")
    a[i] =int(input("Ingrese color " ,i))        

for i in range(10)
    println("Segunda lista de colores ")
    b[i] =int(input("Ingrese color " ,i)) 

for i in range(10)
    println("Tercera lista de colores ")
    c[i] =int(input("Ingrese color " ,i))

for i in range(10)
    println("Cuarta lista de colores ")
    d[i] =int(input("Ingrese color " ,i))

#Comparacion de listas

for i in range(10)
    if (a[i] == b[i])
        if (b[i] == c[i])
            if (c[i] == d[i])
                println("Son iguales")
            else
                println("Son distintas")
        else 
            println("Son distintas")
    else 
        println("Son distintas")
