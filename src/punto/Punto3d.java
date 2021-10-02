
package punto;
import java.util.Scanner;
public class Punto3d extends Punto {
    private double pz;

    public Punto3d(){
      this.pz=0;

    }
    
    public Punto3d(double z){
      this.pz=z;
    }  
    
    public void setZ(double z){
      this.pz=z;
    }    
    public double getZ(){
      return this.pz;
    }

    public void moverZ(double altura){
      this.pz = this.pz + altura;
    }

    public void moverD(double dhorizontal, double dvertical, double daltura){
      super.moverD(dhorizontal, dvertical);
      this.pz = this.pz + daltura;
    }
   
    public double distancia(Punto3d p1){
      double px, py, pz;
      px = (double) Math.pow(p1.getX(),2) - Math.pow(this.getX(),2);
      py = (double) Math.pow(p1.getY(),2) - Math.pow(this.getY(),2);
      pz = (double) Math.pow(p1.pz,2) - Math.pow(this.pz,2);
      double res = Math.sqrt(px + py + pz);
      return res;
    }

    public void leer(double z){
      this.pz=z;
    }

    public String imprimir(){
      String punto = String.format("(%.2f ,%.2f ,%.2f)", this.getX(), this.getY(), this.pz);
      return punto;
    }

}