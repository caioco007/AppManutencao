<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>TP3 - Desenvolvimento de Serviços em Nuvem com Java</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
</head>
<body>

	<div class="container">
		<div class="container-fluid" style="margin-top: 80px"></div>
		<h3>Cadastro de Empresa</h3>

		<div class="form-group">

			<div class="row">
				<div class="col-sm-8">
					<label for="usr">Nome:</label>
					<h11>*</h11>
					<input type="text" class="form-control" name="nome">
				</div>

				<div class="form-row col-md-10">
					<div class="col-sm-5">
						<label for="usr">CNPJ:</label>
						<h11>*</h11>
						<input type="text" class="form-control" name="cnpj">
					</div>					
					<div class="col-sm-3">
						<label for="usr">Nº Celular:</label>
						<h11>*</h11>
						<div class="input-group">
							<div class="input-group-prepend">
								<span class="input-group-text" id="inputGroupPrepend"> <svg
										width="1em" height="1em" viewBox="0 0 16 16"
										class="bi bi-telephone-fill" fill="currentColor"
										xmlns="http://www.w3.org/2000/svg">
				  						<path fill-rule="evenodd"
											d="M2.267.98a1.636 1.636 0 0 1 2.448.152l1.681 2.162c.309.396.418.913.296 1.4l-.513 2.053a.636.636 0 0 0 .167.604L8.65 9.654a.636.636 0 0 0 .604.167l2.052-.513a1.636 1.636 0 0 1 1.401.296l2.162 1.681c.777.604.849 1.753.153 2.448l-.97.97c-.693.693-1.73.998-2.697.658a17.47 17.47 0 0 1-6.571-4.144A17.47 17.47 0 0 1 .639 4.646c-.34-.967-.035-2.004.658-2.698l.97-.969z" />
									  </svg>
								</span>
							</div>
							<input type="tel" class="form-control"
								placeholder="(DDD)xxxxx-xxxx" name="contato">
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>