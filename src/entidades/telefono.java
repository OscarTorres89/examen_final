/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author ekt
 */
public class telefono {
    
    String IME;
    String modelo;
    String marca;
    String MAC;

    public telefono() {}

    public void setime(String IME) {
        this.IME = IME;
    }

    public  String getime() {
        return IME;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

     public String getModelo() {
        return modelo;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }

     public String getMarca() {
        return marca;
    }
     
    public void setmac(String MAC) {
        this.MAC = MAC;
    }

    public String getmac() {
        return MAC;
    }
    
}
