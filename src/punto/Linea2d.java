package punto;
import java.util.Scanner;
public class Linea2d{

  private Punto inicio;
  private Punto fin;

  public Linea2d(){

    inicio = new Punto();
    fin = new Punto();
  }

  public Linea2d( Punto pinicio, Punto pfin){

    this.inicio = pinicio;
    this.fin = pfin;
  }

  
  public void setPinicio(Punto x){
    this.inicio = x;
  }
  public void setPfin(Punto y){
    this.fin = y;
  }

  public Punto getPinicio(){
    return inicio;
  }
  public Punto getPfin(){
    return inicio;
  }

  public void longitudLinea(Punto p3){
    inicio.distancia(fin);
  }

  public void moverV(double lvertical, double lhorizontal){
      this.inicio.moverV(lvertical);
      this.fin.moverV(lhorizontal);
  }

  public void moverH(double mhorizontal, double mvertical){
      this.inicio.moverH(mvertical);
      this.fin.moverH(mhorizontal);
  }

  public void moverD(double ldhorizontal, double ldvertical){
      this.fin.moverD(ldhorizontal,ldvertical);
      this.inicio.moverD(ldhorizontal,ldvertical);
  }
  

  public void leer(double xx, double yy, double xu, double yu){
      this.inicio.leer(xx, yy);
      this.fin.leer(xu,yu);
    } 

  public String imprimir(){
      String num = this.inicio.imprimir();
      return num;
  }
  public String imprimir1(){
      String num = this.fin.imprimir();
      return num;
  }


}