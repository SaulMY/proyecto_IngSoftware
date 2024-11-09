/* este programa se encargara de manejar una lista ligada de productos,
   asi mismo se encargara de agregar el manejo de archivos*/

package com.mycompany.controls;
import com.mycompany.entities.Product;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import javax.swing.JOptionPane;

public class ControlRegProd {
    
    LinkedList<Product> productsList = new LinkedList();
    Product product;
    String fileName = "products.txt";
    
    //se chequea que no haya productos duplicados
    
    //metodo para registrar un nuevo producto
    public void newProduct(String code, String name, String description, int price, int promoPrice, String[] benefits, String imgUrl, LocalDate discStar, LocalDate discEnd){
        //se usa el contructor para crear un nuevo producto a la lista de productos
        product = new Product(code, name, description, price, promoPrice, benefits, imgUrl, discStar, discEnd);
        productsList.add(product);
    }
    
    //metodo para guardarlo en un archivo txt
    public void saveOnFile(){
        
        FileWriter file = null;
        PrintWriter pw = null;
        
        try {
            file = new FileWriter(fileName, true);
            pw = new PrintWriter(file);
            
            //TODO code goes here
            pw.println("Codigo: " + product.getCode());
            pw.println("Nombre: " + product.getName());
            pw.println("Descripcion: " + product.getDescription());
            pw.println("Precio: " + product.getPrice());
            pw.println("Benefits: " + product.getBenefits());
            pw.println("Imagen: " + product.getImgUrl());
            pw.println("Fecha1: " + product.getDiscStar());
            pw.println("Fecha2: " + product.getDiscFin());
            pw.println("\r\n");
            
        }//for a problem in the open or writing
        catch(Exception e){
            System.out.println("Error al guardar");
            JOptionPane.showMessageDialog(null, "Error al guardar.");
        } finally {
            try {
                if (null != file) {
                    file.close();
                }
            }
            catch(Exception e2){
                e2.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error al cerrar el archivo.");
            }
        }
    }
    
    //Metodo para leer desde un archivo txt
    public void readFromFile(String name){
        
    }
    
    //Metodo para buscar datos en la lista
    public int searchCode(String code){
        int index1 = 0;
        for (Product prod: productsList){
            if (prod.getCode().equals(code)){
                index1 = productsList.indexOf(prod);
                return  (index1);
            }
        }
        return(-1);
    }
    
    //Metodo para borrar datos en la lista
    public int deleteCode(String code){
        int index1 = 0;
        for (Product prod: productsList){
            if (prod.getCode().equals(code)){
                index1 = productsList.indexOf(prod);
                productsList.remove(index1);
                return (index1);
            }
        }
        return(-1);
    }
    
    public int searchName(String name){
        int index2 = 0;
        for (Product prod: productsList){
            if (prod.getName().equals(name)){
                index2 = productsList.indexOf(prod);
                return (index2);
            }
        }
        return (-1);
    }
    
    //metodo para obtener los datos del objeto producto
    
    public String getNombre(int index){
        return (productsList.get(index).getName());
    }
    
    public String getCode(int index){
        return (productsList.get(index).getCode());
    }
    
    public String getDesc(int index){
        return (productsList.get(index).getDescription());
    }
    
    public String getPrice(int index){
        return (String.valueOf(productsList.get(index).getPrice()));
    }
    
    public String getPricePromo(int index){
        return (String.valueOf(productsList.get(index).getPromoPrice()));
    }
    
    public String getDate1(int index){
        LocalDate date = productsList.get(index).getDiscStar();
        return (date.format(DateTimeFormatter.ISO_LOCAL_DATE));
    }
    
    public String getDate2(int index){
        LocalDate date = productsList.get(index).getDiscFin();
        return (date.format(DateTimeFormatter.ISO_LOCAL_DATE));
    }
    
    public String getImg(int index){
        return (productsList.get(index).getImgUrl());
    }
    
    public String getBene(int index){
        String string = new String();
        String[] arr = productsList.get(index).getBenefits();
        
        for (int i = 0; i < productsList.get(index).getBenefits().length; i++){
            string = string + arr[i] + " ";
        }
        return (string);
    }
}
