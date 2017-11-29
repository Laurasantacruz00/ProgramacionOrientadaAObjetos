class Chocolate():
	
	"""author: @LauraSantacruz"""

	"""Un marciano viene a visitar a un humano, el humano lo hace pasar y habla con el,
	el marciano le dice que le han hablado del chocolate, al humano se le ocurre la gran idea de hacerle uno"""

	#Acciones del humano

	#Buscar ingredientes
	
	def BuscarLeche(self):
		print ("\nLa persona se dirige a la nevera y saca la leche." )

	def BuscarCanela(self):
		print ("\n Se dirige a la cocina, deja la leche en el meson y en la esquina superior izquierda se encuentra la canela" )

	def BuscarAzucar(self):
		print ("\n Despues, saca el azucar" )

	def BuscarOlleta(self):
		print ("\n En la parte inferior derecha se encuentran las ollas, de este lugar saca la olleta" )

	def BuscarTaza(self):
		print ("\n En la parte inferior izquierda se encuentran las tazas y los vasos, de este lugar saca dos tazas" )

	#Procedimiento		 

	def EncenderFogon(self):
		print ("\nAl tener todos los ingredientes, la persona prende el fogon" )

	def HervirLeche(self):
		print ("\n Vierte la leche en la olleta y añade la canela")

	def BuscarAzucar(self):
		print ("\n Despues, saca el azucar" )

	def BuscarOlleta(self):
		print ("\n En la parte inferior derecha se encuentran las ollas, de este lugar saca la olleta" )

	def Choco(self):
		print ("\n Al hervir la leche, el humano añade una tablilla en trozos de chocolate")

	def Azucar(self):
		print ("\n En la parte inferior derecha se encuentran las ollas, de este lugar saca la olleta" )

	def servir(self):
		print ("\n Por ultimo vierte el chocolate en dos tazas y se sienta junto al Marciano, os dos disfrutan del rico chocolate")	

#Aqui crearemos nuestras instanciasAObjetos			 	 	 	

#El humano busva los ingredientes

ingredientes = Chocolate()

ingredientes.BuscarLeche();
ingredientes.BuscarCanela();
ingredientes.BuscarAzucar();
ingredientes.BuscarOlleta();
ingredientes.BuscarTaza();

#Prepara el chocolate

Procedimiento = Chocolate()

Procedimiento.EncenderFogon();
Procedimiento.HervirLeche();
Procedimiento.Choco();
Procedimiento.Azucar();
Procedimiento.servir();

