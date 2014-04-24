MarsRoverCodingProblem
======================

Mars Rover Coding Problem

Obj: Reconocer los comandos introducidos por consola
1.- Linea uno: Leer em MAX_X y MAX_Y del ambiente (rectangulo previstro)  (maxX, maxY)
2.- Linea dos: Leer la posicion inicial INI_X e INI_Y re robot + ORIENTACION (iniX, iniY, orientacion)
3.- Linea tres: Leer lasinstruccion de desplazamiento: XXXXXXX donde x={L,R,D} L=girar Izq, R=gigirar Der. y D=MoverRobot

Objeto Principal: RobertCtrl
                       -RobertCtrl(maxX, maxY)
                       -start(iniX, iniY, orientacion);
                       -execute(comando, debug)
                       -getStatus()
                       -getOrientation()
                       -mover();
                       -checkOrientation();
                       
