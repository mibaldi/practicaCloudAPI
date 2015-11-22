package controllers;

import java.util.List;

import com.fasterxml.jackson.databind.JsonNode;
import models.UsuarioModel;
import play.*;
import play.data.Form;
import play.mvc.*;

public class AplicacionController extends Controller {

    public Result index() {
    	return ok(views.html.index.render());
    }
   

}
