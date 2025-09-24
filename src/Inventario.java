import java.util.ArrayList;

public class Inventario {

//atributos
    private String nombreTienda;
    private ArrayList<Productos>Inventario;

    //Constructor

    public Inventario(String nombreTienda, ArrayList<Productos>Inventario){
        this.nombreTienda=nombreTienda;
        this.Inventario=Inventario;
    }

    //metodos basicos
    //agregarProducto -0(1) complejidad la mas sencilla

    public void agregarProducto(Productos producto) {
        Inventario.add(producto);
    }

    //eliminar producto

    public void eliminarProducto(String codigoProducto){
        boolean eliminado= false;
        int i=0;
        while (i < Inventario.size() && !eliminado){
            if(Inventario.get(i).getCodProducto().equals(codigoProducto)){
                Inventario.remove(1);
                eliminado= true;
                System.out.println("el producto "+ codigoProducto + " Se ha eliminado");
            }else {
                i++;
            }
            if(!eliminado){
                System.out.println("el producto "+ codigoProducto + " no existe");
            }
        }
    }

    //Actualizar Producto

    public void modificarProducto(String codigoProducto, Productos producto){
        int i=0;
        while ((i<Inventario.size())){
        }if(Inventario.get(i).getCodProducto().equals(producto.getCodProducto())){
        Inventario.remove(i);
        Inventario.add(producto);
            System.out.println("El producto"+producto+"se ha modificado");
        }else {
            System.out.println("El producto "+ producto.getCodProducto()+ "No existe");
        }
    }

    //Buscar producto

    public static String buscarProducto(String codigoProducto){
        boolean buscado=false;
        int i=0;
        while (i < Inventario.size() && !buscado){
            if(Inventario.get(i).getCodProducto().equals(codigoProducto)){
                buscado=true
            }
        }
    }

   //mostrar el inventario

    //consultar productos por categoria

    //precio de todo el inventario

    //vender un producto

}
