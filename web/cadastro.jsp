<%-- 
    Document   : cadastro
    Created on : 25/06/2020, 21:53:31
    Author     : prisc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Cadastrar</h1>
        
           <form>
  <div class="form-group">
    <label for="exampleInputEmail1">Nome</label>
    <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email"><br>
  </div><br>
  
  <div class="form-group">
    <label for="exampleInputPassword1">Senha</label>
    <input type="password" class="form-control" id="exampleInputPassword1" placeholder="Password"><br>
    <label for="exampleInputPassword1">Confirmar Senha</label>
    <input type="password" class="form-control" id="exampleInputPassword1" placeholder="Password"><br>
  </div><br>
  
    <a class="btn btn-primary" href="index.jsp" role="button">Salvar</a><br/><br/>
   
</form>  
    </body>
</html>
