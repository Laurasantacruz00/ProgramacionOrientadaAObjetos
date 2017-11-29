class Nomina():
   def __init__(self,nombre,ape,ced,salario,sex,estciv,hijo):
      self.Nombre=nombre
      self.Apellido=ape
      self.Cedula=ced
      self.Salario=salario
      self.Genero=sex
      self.EstadoC=estciv   
      self.Nhijos=hijo
   def Empleado(self):
      print ("Nombre del empleado: " )  

   empleado1 = Nomina ("juanito", "Alimaña", 307803030, 57907870,"Masculino", "Soltero", 2)
   empleado1.Empleado() 
   print (empleado1.nombre)   
   print("\n Apellido: " , empleado1.ape, " y cedula del empleado: " , empleado1.ced)
   print("\nGenero del empleado : ", empleado1.sex)
   print("\nEstado civil: " , empleado1.estciv)
   print("\nNumero de hijos :  ",empleado1.hijo, " hijos")
   print("\n Este recibe un salario de : " , empleado1.salario)

   empleado2 = Nomina ("Daniel","Andrade",123458,80000000,"Masculino", "Casado", 3)
   empleado2.Empleado() 
   print (empleado2.nombre)
   print("\n Apellido: " , empleado2.ape, " y cedula del empleado: " , empleado2.ced)
   print("\nGenero del empleado :", empleado2.sex)
   print("\nEstado civil:  " , empleado2.estciv)
   print("\nNumero de hijos : ",empleado2.hijo, " hijos")
   print("\n Este recibe un salario de : " , empleado2.salario)


   empleado3 = Nomina ("Martha","Ojeda",12345678,78900000,"Femenino", "Casada", 3)
   empleado3.Empleado() 
   print (empleado3.nombre)
   print("\n Apellido: " , empleado3.ape, " y cedula del empleado: " , empleado3.ced)
   print("\nGenero del empleado :", empleado3.sex)
   print("\nEstado civil:  " , empleado3.estciv)
   print("\nNumero de hijos : ",empleado3.hijo, " hijos")
   print("\n Este recibe un salario de : " , empleado3.salario)

   empleado4 = Nomina("Laura","Santacruz",98091000,4512313,"Femenino", "Soltera", 1)
   empleado4.Empleado() 
   print (empleado4.nombre)
   print("\n Apellido: " , empleado4.ape, " y cedula del empleado: " , empleado4.ced)
   print("\nGenero del empleado :", empleado4.sex)
   print("\nEstado civil:  " , empleado4.estciv)
   print("\nNumero de hijos : ",empleado4.hijo, " hijos")
   print("\n Este recibe un salario de : " , empleado4.salario)

   empleado5 = Nomina ("Sergio","Cadena",564213156,2000000,"Masculino", "Casado", 5)
   empleado5.Empleado() 
   print (empleado5.nombre)
   print("\n Apellido: " , empleado5.ape, " y cedula del empleado: " , empleado5.ced)
   print("\nGenero del empleado :", empleado5.sex)
   print("\nEstado civil:  " , empleado5.estciv)
   print("\nNumero de hijos : ",empleado5.hijo, " hijos")
   print("\n Este recibe un salario de : " , empleado5.salario)

	