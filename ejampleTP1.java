/******* RESUMEN
 * En resumen, es importante encapsular todo lo posible, distribuir
 * correctamnte las responsabilidades, revisar los metodos excesivamente
 * largos, revisar getter's y setter's, revisar CASE
 * revisar los tipos standar como parametros de entrada y retorno, ya sea
 * primitivos String, List....
 *
 * */

// Implementacion de un ejemplo de POO mal estructurado
// Muchos if, no se usa encapsulamiento
// No se permite crear modificaciones como el agregar otro jugador
// Responsabilidad de clases sin limitaciones correctas

/* Tener cuidado al crear momento de crear el diagrama de clases
 * ya que se puede mostrar atributos que tendrian que estar ocultos
 * y estar encapsulado con metodos que normen su funcionamiento.
 */


/*******						 LIMITACIONES			**************
 **Se repite el codigo
 **Consntantes Magicas.... this.direccion == 1  NUNCA!!!!!
 **Calculos complicados.(Mapa algocraft)
 * 		No se debe explicar lo que el codigo esta destinado a hacer, el
 * 		test es quien debe definir eso.
 * 		La unica documentacion debe estar referia a pruebas
 **Poco encapsulamiento
 */

int incX, incY ;
if (this.direccion == 1 ) {
	incX = 0; incY  = 1 ; //top
	} else if ... {...}
this.x = this.x + incX ;
this.y = this.y + incY;



if (this.y > getEspacio().getY() ) {
	//choque contra el borde superior

	this.y = this.y - 1
	}

// voy a chocar al jugador
int posJugY = espacio.getNaveJug().getY();
int incY = posJugY / Math.abs()
this.y = this.y + incY



// Implementacion correcta para POO del problema planteado


// Nave.mover
this.posicion = this.movimientocalcularPosSiguiente(this.posicion)
// Movimiento.calcularPosSiguiente
posicion = this.direccion.desplazarPos(posicion);
if ! posicion.dentroDe(espacio.getLimite()) {
	this.direccion = direccion.dirOpuesta();
	}
