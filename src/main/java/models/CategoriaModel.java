package models;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Categoria")
public class CategoriaModel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Id_Categoria;
	private String Nombre;

	public Long getId_Categoria() {
		return Id_Categoria;
	}
	public void setId_Categoria(Long id_Categoria) {
		Id_Categoria = id_Categoria;
	}

    public String getNombre()
    {
        return Nombre;
    }

    public void setNombre(String Nombre)
    {
        this.Nombre=Nombre;
    }
}
