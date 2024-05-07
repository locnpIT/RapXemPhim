<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- Tạo form với jstl -->
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%> 
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
    <meta name="description" content="Nguyễn Phước Lộc - Dự án laptopshop" />
    <meta name="author" content="Nguyễn Phước Lộc" />
    <title>Delete product</title>
    <link href="https://cdn.jsdelivr.net/npm/simple-datatables@7.1.2/dist/style.min.css" rel="stylesheet" />
    <link href="/css/styles.css" rel="stylesheet" />
    <script src="https://use.fontawesome.com/releases/v6.3.0/js/all.js" crossorigin="anonymous"></script>
</head>

<body class="sb-nav-fixed">
    <jsp:include page="../layout/header.jsp"/>
    <div id="layoutSidenav">
        <jsp:include page="../layout/sidebar.jsp"/>
        <div id="layoutSidenav_content">
            <main>
                <div class="container-fluid px-4">
                    <h1 class="mt-4">Delete product</h1>
                    <ol class="breadcrumb mb-4">
                        <li class="breadscrum-item"><a href="/admin">Dashboard</a></li> 
                        <li class="breadcrumb-item active">Delete product</li>
                    </ol>
                    <div class="container mt-5">
                        <div class="row">
                            <div class="col-12 mx-auto">
                                <div class="d-flex justify-content-between">
                                    <h3>Delete product with id = ${id}</h3>
                                </div>
                                <hr>
                
                                <div class="alert alert-danger" role="alert">
                                    Bạn có muốn xóa phim này không?
                                </div>
                                
                                <form:form method="post" action="/admin/phim/delete" modelAttribute="newPhim">
                                    <div class="mb-3" style="display: none;">
                                        <label class="form-label">Id</label>
                                        <form:input value="${id}" type="text" class="form-control" path="idPhim" />
                                        <!-- lưu ý là cái path phải trùng với attribute trong class -->
                                    </div>
                
                                    <button type="submit" class="btn btn-success mt-2" >
                                        Confirm
                                    </button>
                                    <a href="/admin/phim" class="btn btn-danger mt-2">Cancel</a>
                                </form:form>
                
                            </div>
                
                        </div>
                
                    </div>
                </div>
            </main>
            <jsp:include page="../layout/footer.jsp"/>
        </div>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
        crossorigin="anonymous"></script>
    <script src="js/scripts.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.8.0/Chart.min.js" crossorigin="anonymous"></script>
    <script src="js/chart-area-demo.js"></script>
    <script src="js/chart-bar-demo.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/simple-datatables@7.1.2/dist/umd/simple-datatables.min.js"
        crossorigin="anonymous"></script>
    <script src="js/datatables-simple-demo.js"></script>
</body>

</html>