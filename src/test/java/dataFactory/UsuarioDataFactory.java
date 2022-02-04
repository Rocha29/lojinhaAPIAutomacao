package dataFactory;

import pojo.UsuarioPojo;

public class UsuarioDataFactory {
    public  static UsuarioPojo criarUsuarioAdminitrador(){
        UsuarioPojo ususario = new UsuarioPojo();
        ususario.setUsuarioLogin("admin");
        ususario.setUsuarioSenha("admin");
        return ususario;

    }
}
