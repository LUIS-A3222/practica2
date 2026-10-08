public class Civilizacion {

private String nombre;
private String era;
private int poblacion;
private int alimento;
private int madera;
private int oro;

public void crearAldeano(){
if(alimento >= 50 ){
    poblacion = poblacion + 1;
    alimento = alimento - 50;}
}

public Civilizacion (String nombre,String era,int poblacion,int alimento,int madera,int oro){
this.nombre = nombre;
this.era = era;
this.poblacion = poblacion;
this.alimento = alimento;
this.madera = madera;
this.oro = oro;                  }


public int getAlimento(){
    return alimento;            }
    
public void setAlimento(int alimento){
 if(alimento >= 0){
    this.alimento = alimento;
 }else{     }
}

public int getMadera(){
    return madera;            }

public void setMadera(int madera){
 if(madera >= 0){
    this.madera = madera;
 }else{     }
}

public int getOro(){
    return oro;            }
public void setOro(int oro){
 if(oro >= 0){
    this.oro = oro;
 }else{     }

}
public int getPoblacion(){
    return poblacio;            }
public void setPoblacion(int poblacion){ 
    this.poblacion = poblacion; 
}

public int getEra(){
    return oro;            }
public void setEra(String era){ 
    this.era = era; 
}

public int getNombre(){
    return  nombre;            }

public void setNombre(String nombre){ 
    this.nombre = nombre;
 }

 public void mostrarEstado() {
    System.out.println("Civilizacion: " + nombre);
    System.out.println("Era: " + era);
    System.out.println("Poblacio: " + poblacion);
    System.out.println("Madera: " + madera);
    System.out.println("Alimento: " + alimento);
    System.out.println("ORO: " + oro);

 }
 public static void main(String[] args) {
Civilizacion civilizacion1 =  new Civilizacion("Egipcia", "II", 200, 300, 500, 1000);
civilizacion1.mostrarEstado();
System.out.println();
Civilizacion civilizacion2 =  new Civilizacion("Mesopotamia", "II", 500, 600, 1000, 10000);
civilizacion2.mostrarEstado();
System.out.println();

civilizacion1.setAlimento(civilizacion1.getAlimento()+500);
civilizacion2.setAlimento(civilizacion2.getAlimento()+100);

civilizacion1.setMadera(civilizacion1.getMadera()+100);
civilizacion2.setMadera(civilizacion2.getMadera()+200);

civilizacion1.setOro(civilizacion1.getOro()+10);
civilizacion2.setOro(civilizacion2.getOro()+30);

civilizacion1.crearAldeano();
civilizacion2.crearAldeano();


civilizacion1.mostrarEstado();
System.out.println();
civilizacion2.mostrarEstado();
System.out.println();

civilizacion1.setAlimento(civilizacion1.getAlimento()-725);
civilizacion2.setAlimento(civilizacion2.getAlimento()-625);

civilizacion1.crearAldeano();
civilizacion2.crearAldeano();

civilizacion1.mostrarEstado();
System.out.println();
civilizacion2.mostrarEstado();
System.out.println();

}
}