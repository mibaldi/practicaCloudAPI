package models;

import javax.persistence.*;
import com.avaje.ebean.Model;

@Entity
public class UsuarioModel  extends Model{
	@Id
	public Long id;
}
