package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class TareasController extends Controller {

    public Result index() {
        return ok("hola");
    }

}
