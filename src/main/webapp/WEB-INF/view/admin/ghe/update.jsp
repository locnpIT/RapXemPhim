<%@page contentType="text/html" pageEncoding="UTF-8" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
            <!DOCTYPE html>
            <html lang="en">

            <head>
                <meta charset="utf-8" />
                <meta http-equiv="X-UA-Compatible" content="IE=edge" />
                <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
                <meta name="description" content="Nguyễn Phước Lộc - Dự án laptopshop" />
                <meta name="author" content="Nguyễn Phước Lộc" />
                <title>Create Product</title>
                <link href="/css/styles.css" rel="stylesheet" />
                <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
                <script src="https://use.fontawesome.com/releases/v6.3.0/js/all.js" crossorigin="anonymous"></script>
            </head>

            <body class="sb-nav-fixed">
                <jsp:include page="../layout/header.jsp" />
                <div id="layoutSidenav">
                    <jsp:include page="../layout/sidebar.jsp" />
                    <div id="layoutSidenav_content">
                        <main>
                            <div class="container-fluid px-4">
                                <h1 class="mt-4">Products</h1>
                                <ol class="breadcrumb mb-4">
                                    <li class="breadcrumb-item"><a href="/admin">Dashboard</a></li>
                                    <li class="breadcrumb-item active">Product</li>
                                </ol>
                                <div class="mt-5">
                                    <div class="row">
                                        <div class="col-md-6 col-12 mx-auto">
                                            <form:form method="post" action="/admin/phim/update" class="row"
                                                enctype="multipart/form-data" modelAttribute="newPhim">
                                                <h3>Update phim with id = ${id}</h3>
                                                <hr>
                                                
                                            

                                                <div class="mb-3" style="display: none;">
                                                    <label class="form-label">Mã phim</label>
                                                    <form:input type="text" class="form-control" path="idPhim" />
                                                </div>
                                                
                                                <div class="mb-3 col-12 col-md-6">
                                                    <label class="form-label">Tên phim:</label>
                                                    <form:input type="text" 
                                                    class="form-control" path="tenPhim" />
        
                                                </div>
                                                <div class="mb-3 col-12 col-md-6">
                                                    <label class="form-label">Đạo diễn:</label>
                                                    <form:input type="daoDien" 
                                                    class="form-control" path="daoDien" />
                                                
                                                </div>
                                                <div class="mb-3 col-12">
                                                    <label class="form-label">Diễn viên:</label>
                                                    <form:textarea type="text" 
                                                    class="form-control" path="dienVien" />
                                                </div>
                                                <div class="mb-3 col-12 col-md-6">
                                                    <label class="form-label">Hình ảnh phim:</label>
                                                    <form:input type="text" 
                                                    class="form-control" path="hinhAnh" />
                                                </div>
                    
                                                <div class="col-12 mb-5">
                                                    <button type="submit" class="btn btn-warning">Update</button>
                                                </div>
                                            </form:form>

                                        </div>

                                    </div>
                                </div>
                            </div>
                        </main>
                        <jsp:include page="../layout/footer.jsp" />
                    </div>
                </div>
                <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
                    crossorigin="anonymous"></script>
                <script src="/js/scripts.js"></script>

            </body>

            </html>