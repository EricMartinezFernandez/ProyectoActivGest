package com.company;
import controlador.ControladorBbDd;
import controlador.sqlite.MetadatoBd;
import controlador.sqlite.SqliteConsulta;
import modelo.Actividad;

import java.sql.Connection;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here

        ControladorBbDd controladorBbDd = new ControladorBbDd("hegoalde");

        Connection conexionBd = null;

        conexionBd = controladorBbDd.getConexion();

        //MetadatoBd metadatoBd = new MetadatoBd(conexionBd);

        SqliteConsulta sqliteConsulta = new SqliteConsulta(conexionBd);

        sqliteConsulta.actividadesHegoaldeSqlite();

        sqliteConsulta.usuariosHegoaldeSqlite();

        sqliteConsulta.empleadosHegoaldeSqlite();

        sqliteConsulta.tablaMostrarActividades(sqliteConsulta.getActividades());

        sqliteConsulta.tablaMostrarUsuarios(sqliteConsulta.getUsuarios());

        sqliteConsulta.tablaMostrarEmpleados(sqliteConsulta.getEmpleados());



    }
}
