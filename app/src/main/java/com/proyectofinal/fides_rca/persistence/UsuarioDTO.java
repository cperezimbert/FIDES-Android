package com.proyectofinal.fides_rca.persistence;

public class UsuarioDTO {

    private long id;
    private String nombreUsuario;
    private String password;
    private long estado;
    private String estadoNombre;
    private long tipoUsuario;
    private String tipoUsuarioNombre;
    private String nombre;
    private String apellido;
    private long tipoDocumento;
    private String tipoDocumentoNombre;
    private String numeroDocumento;
    private String direccion;
    private String correo;
//	--------------


    public UsuarioDTO() {
        super();
    }
    public UsuarioDTO(long id, String nombreUsuario, String password, long estado,
                      String estadoNombre, long tipoUsuario, String tipoUsuarioNombre,
                      String nombre, String apellido, long tipoDocumento,
                      String tipoDocumentoNombre, String numeroDocumento, String direccion,
                      String correo) {
        super();
        this.id = id;
        this.nombreUsuario = nombreUsuario;
        this.password = password;
        this.estado = estado;
        this.estadoNombre = estadoNombre;
        this.tipoUsuario = tipoUsuario;
        this.tipoUsuarioNombre = tipoUsuarioNombre;
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipoDocumento = tipoDocumento;
        this.tipoDocumentoNombre = tipoDocumentoNombre;
        this.numeroDocumento = numeroDocumento;
        this.direccion = direccion;
        this.correo = correo;
    }

    public UsuarioDTO(String usu, String pass){
        super();
        this.id = id;
        this.nombreUsuario = usu;
        this.password = pass;
    }

    public UsuarioDTO(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getNombreUsuario() {
        return nombreUsuario;
    }
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public long getEstado() {
        return estado;
    }
    public void setEstado(long estado) {
        this.estado = estado;
    }
    public String getEstadoNombre() {
        return estadoNombre;
    }
    public void setEstadoNombre(String estadoNombre) {
        this.estadoNombre = estadoNombre;
    }
    public long getTipoUsuario() {
        return tipoUsuario;
    }
    public void setTipoUsuario(long tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
    public String getTipoUsuarioNombre() {
        return tipoUsuarioNombre;
    }
    public void setTipoUsuarioNombre(String tipoUsuarioNombre) {
        this.tipoUsuarioNombre = tipoUsuarioNombre;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public long getTipoDocumento() {
        return tipoDocumento;
    }
    public void setTipoDocumento(long tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }
    public String getTipoDocumentoNombre() {
        return tipoDocumentoNombre;
    }
    public void setTipoDocumentoNombre(String tipoDocumentoNombre) {
        this.tipoDocumentoNombre = tipoDocumentoNombre;
    }
    public String getNumeroDocumento() {
        return numeroDocumento;
    }
    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    @Override
    public String toString() {
        return "UsuarioDTO [id=" + id + ", nombreUsuario=" + nombreUsuario + ", password=" + password + ", estado="
                + estado + ", estadoNombre=" + estadoNombre + ", tipoUsuario=" + tipoUsuario + ", tipoUsuarioNombre="
                + tipoUsuarioNombre + ", nombre=" + nombre + ", apellido=" + apellido + ", tipoDocumento="
                + tipoDocumento + ", tipoDocumentoNombre=" + tipoDocumentoNombre + ", numeroDocumento="
                + numeroDocumento + ", direccion=" + direccion + ", correo=" + correo + "]";
    }


}
