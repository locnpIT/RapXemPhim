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
                                <h1 class="mt-4">Phim</h1>
                                <ol class="breadcrumb mb-4">
                                    <li class="breadcrumb-item"><a href="/admin">Dashboard</a></li>
                                    <li class="breadcrumb-item active">Phim</li>
                                </ol>
                                <div class="mt-5">
                                    <div class="row">
                                        <div class="col-md-6 col-12 mx-auto">
                                            <h3>Tạo mới một bộ phim</h3>
                                            <hr />
                                            <form:form method="post" action="/admin/phim/create" class="row"
                                                enctype="multipart/form-data" modelAttribute="newPhim">

                                                <div class="mb-3 col-12 col-md-6">
                                                    <label class="form-label">Mã phim:</label>
                                                    <form:input type="text" 
                                                    class="form-control" path="idPhim" />
                                                </div>
                                                <div class="mb-3 col-12 col-md-6">
                                                    <label class="form-label">Tên phim:</label>
                                                    <form:input type="text" 
                                                    class="form-control" path="tenPhim" />

                                                </div>
                                                <div class="mb-3 col-12 col-md-6">
                                                    <label class="form-label">Nội dung:</label>
                                                    <form:input type="text" 
                                                    class="form-control" path="noiDung" />
                                                </div>
                                                <div class="mb-3 col-12 col-md-6">
                                                    <label class="form-label">Thời lượng:</label>
                                                    <form:input type="text" 
                                                    class="form-control" path="thoiLuong" />
                                                </div>
                                                <div class="mb-3 col-12 col-md-6">
                                                    <label class="form-label">Ngôn ngữ:</label>
                                                    <form:input type="text" 
                                                    class="form-control" path="ngonNgu" />
                                                </div>
                                                <div class="mb-3 col-12 col-md-6">
                                                    <label class="form-label">Đạo diễn:</label>
                                                    <form:input type="text" 
                                                    class="form-control" path="daoDien" />
                                                </div>
                                                <div class="mb-3 col-12 col-md-6">
                                                    <label class="form-label">Diễn viên:</label>
                                                    <form:input type="text" 
                                                    class="form-control" path="dienVien" />
                                                </div>

                                                
                                                <div class="mb-3 col-12 col-md-6">
                                                    <label class="form-label">Giới hạn tuổi:</label>
                                                    <form:input type="text" 
                                                    class="form-control" path="gioiHanTuoi" />
                                                </div>
                                                <div class="mb-3 col-12 col-md-6">
                                                    <label class="form-label">Ngày khởi chiếu:</label>
                                                    <form:input type="text" 
                                                    class="form-control" path="ngayKhoiChieu" />
                                                </div>
                                                <div class="mb-3 col-12 col-md-6">
                                                    <label class="form-label">Ngày kết thúc:</label>
                                                    <form:input type="text" 
                                                    class="form-control" path="ngayKetThuc" />
                                                </div>
                                                <div class="mb-3 col-12 col-md-6">
                                                    <label class="form-label">Trailer:</label>
                                                    <form:input type="text" 
                                                    class="form-control" path="trailer" />
                                                </div>
                                                <div class="mb-3 col-12 col-md-6">
                                                    <label class="form-label">Hình ảnh:</label>
                                                    <form:input type="text" 
                                                    class="form-control" path="hinhAnh" />
                                                </div>
                                                
                                                
                                                
                                                <div class="col-12 mb-5">
                                                    <button type="submit" class="btn btn-primary">Tạo mới</button>
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