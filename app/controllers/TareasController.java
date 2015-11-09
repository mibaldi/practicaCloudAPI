package controllers;

import java.util.List;

import com.fasterxml.jackson.databind.JsonNode;

import models.UsuarioModel;
import play.*;
import play.data.Form;
import play.mvc.*;

public class TareasController extends Controller {

    public Result index() {
        return ok("hola");
    }
    public Result getUser(String nombre){
    	if(UsuarioModel.existe(nombre)){
    		UsuarioModel uu =UsuarioModel.findByNombre(nombre);
        	return ok("existe "+uu.nombre);
    	}else{
    		return notFound("usuario no existe");
    	}
    	
    }
    public Result listaUsuarios(){
    	
		if (request().accepts("application/xml")) {
			return ok(views.xml.vistaUsuarios.render(UsuarioModel.all()));
		} else if (request().accepts("application/json")) {
			JsonNode jn = play.libs.Json.toJson(UsuarioModel.all());
			return ok(jn);
		} else {
			return badRequest("Unsupported format");
		}
    }
    public Result createUser() {
    	Form<UsuarioModel> form = Form.form(UsuarioModel.class).bindFromRequest();
    	if (form.hasErrors()) {
			System.out.println("erorrrrr");
			return badRequest(form.errorsAsJson());
		}
    	UsuarioModel uu=form.get();
    	uu.save();		
        return ok("usuario creado");
    }
    public Result update(String nombre){
    	return ok("modificado "+nombre);
    }
    public Result delete(String nombre){
    	return ok("borrado "+nombre);
    }

}
