MarsRoverCodingProblem
======================

Mars Rover Coding Problem

Obj: Reconocer los comandos introducidos por consola
<ol>
<li>Linea uno: Leer em MAX_X y MAX_Y del ambiente (rectangulo previstro)  (maxX, maxY)
</li><li>Linea dos: Leer la posicion inicial INI_X e INI_Y re robot + ORIENTACION (iniX, iniY, orientacion)
</li><li>Linea tres: Leer lasinstruccion de desplazamiento: XXXXXXX donde x={L,R,D} L=girar Izq, R=gigirar Der. y D=MoverRobot
</li><ol>
<ul>
<li>
<b>Objeto Principal: RobertCtrl</b>
<ul>
<li>
                       -RobertCtrl(maxX, maxY)
</li><li>                       -start(iniX, iniY, orientacion);
</li><li>                       -execute(comando, debug)
</li><li>                       -getStatus()
</li><li>                       -getOrientation()
</li><li>                       -mover();
</li><li>                       -checkOrientation();
         </li><ul>              
</li>
<li>
<b>Run Case: MarsRoverCodingProblem</b>
</li>
<li>
<b>Exception Case: RobertParamException</b>
</li>
</ul>
