package CapaLogica;
//modifcica
public class LineaPedido {
    
    private int id_pedido;
    private int id_linea;
    

    public LineaPedido(int id_pedido, int id_linea) {
        this.id_pedido = id_pedido;
        this.id_linea = id_linea;
        
    }

    public int getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }

    public int getId_linea() {
        return id_linea;
    }

    public void setId_linea(int id_linea) {
        this.id_linea = id_linea;
    }

   
}





