<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
    <meta name="description" content="Nguyễn Phước Lộc - Dự án rạp chiếu phim" />
    <meta name="author" content="Nguyễn Phước Lộc" />
    <title>Dashboard - Nguyễn Phước Lộc</title>
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
                    <h1 class="mt-4">Dashboard</h1>
                    <ol class="breadcrumb mb-4">
                        <li class="breadscrum-item"><a href="/admin">Dashboard</a></li> 
                        <li class="breadcrumb-item active">Ghế</li>
                    </ol>
                    <div class="container mt-5">
                        <div class="row">
                            <div class="col-12 mx-auto">
                                <div class="d-flex justify-content-between">
                                    <h3>Danh sách ghế</h3>
                                    <a href="/admin/ghe/create" class="btn btn-primary">Thêm mới ghế</a>
                                </div>
                                <hr>
                                <table class="table table-bordered table-hover">
                                    <thead>
                                        <tr>
                                            <th>Mã ghế</th>
                                            <th>Mã phòng</th>
                                            <th>Mã số ghế</th>
                                            <th>Mã hàng ghế</th>
                                            <th>Trạng thái</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <c:forEach var="ghe" items="${listGhe}">
                                            <tr>
                                                <td>${ghe.idGhe}</td>
                                                <td>${ghe.phongChieu.idPhong}</td>
                                                <td>${ghe.soGhe.idSoGhe}</td>
                                                <td>${ghe.hangGhe.idHangGhe}</td>
                                                <td>${ghe.trangThai}</td>
                                                <td>
                                                    <a
                                                    href="/admin/ghe/${ghe.idGhe}" 
                                                    class="btn btn-success">View</a>
                                                    <a href="/admin/ghe/update/${ghe.idGhe}" class="btn btn-warning mx-2">Update</a>
                                                    <a href="/admin/ghe/delete/${ghe.idGhe}" class="btn btn-danger">Delete</button>
                    
                                                </td>
                                            </tr>
                                        </c:forEach>
                                    </tbody>
                                </table>
                
                                
                          
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