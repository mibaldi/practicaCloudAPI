package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class TareasController extends Controller {

    public Result index() {
        return ok("hola");
    }
    public Result getUser(String nombre){
    	return ok("existe "+nombre);
    }
    public Result listaUsuarios(){
    	return ok("lista usuarios");
    }
    public Result createUser() {
        return ok("usuario creado");
    }
    public Result update(String nombre){
    	return ok("modificado "+nombre);
    }
    public Result delete(String nombre){
    	return ok("borrado "+nombre);
    }

}
