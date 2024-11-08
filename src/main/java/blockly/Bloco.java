package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;


@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Bloco {

public static final int TIMEOUT = 300;

/**
 *
 * @param x
 * @param y
 *
 * @author Leandro Leonardo Assarice
 * @since 08/11/2024, 15:17:34
 *
 */
public static Var Executar(@ParamMetaData(description = "x", id = "83a4c923") Var x, @ParamMetaData(description = "y", id = "8eab2ab9") Var y) throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeValueOfField"),
    Var.valueOf("vars.resp"),
    cronapi.math.Operations.sum(x,y));
    return Var.VAR_NULL;
   }
 }.call();
}

}

