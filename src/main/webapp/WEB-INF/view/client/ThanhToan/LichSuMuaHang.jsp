<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>HomePage</title>

     <!-- Google Web Fonts -->
     <link rel="preconnect" href="https://fonts.googleapis.com">
     <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
     <link href="https://fonts.googleapis.com/css2?family=Open+Sans:wght@400;600&family=Raleway:wght@600;800&display=swap" rel="stylesheet"> 

     <!-- Icon Font Stylesheet -->
     <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.15.4/css/all.css"/>
     <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.4.1/font/bootstrap-icons.css" rel="stylesheet">

     <!-- Libraries Stylesheet -->
     <link href="/client/lib/lightbox/css/lightbox.min.css" rel="stylesheet">
     <link href="/client/lib/owlcarousel/assets/owl.carousel.min.css" rel="stylesheet">


     <!-- Customized Bootstrap Stylesheet -->
     <link href="/client/css/bootstrap.min.css" rel="stylesheet">

     <!-- Template Stylesheet -->
     <link href="/client/css/style.css" rel="stylesheet">
</head>

    <!-- Spinner Start -->
    <div id="spinner" class="show w-100 vh-100 bg-white position-fixed translate-middle top-50 start-50  d-flex align-items-center justify-content-center">
        <div class="spinner-grow text-primary" role="status"></div>
    </div>
    <!-- Spinner End -->


    <jsp:include page="../layout/header.jsp"/>




   <!-- Bat dau lich su dat ve-->

    <main>
        <div class="container-fluid px-4">
            
            <div class="container mt-5">
                <div class="row">
                    <div class="col-12 mx-auto">
                        <div class="d-flex justify-content-between">
                            
                        </div>
                        <div class="d-flex justify-content-between">
                            <h3>Lịch sử mua hàng</h3>
                        </div>
                        <hr>
        
                        <div class="d-flex justify-content-between">
                            <h3>Lịch sử mua hàng</h3>
                        </div>
                        <table class="table table-bordered table-hover">
                            <thead>
                                <tr>
                                    <th>Mã Hóa đơn</th>
                                    <th>Ngày đặt</th>
                                    <th>Hành động</th>
                                </tr>
                            </thead>
                            <tbody>
                                <c:forEach var="hoaDon" items="${hoaDonNguoiDung}">
                                    <tr>
                                        <td>${hoaDon.idHoaDon}</td>
                                        <td>${hoaDon.ngayXuatHoaDon}</td>
                                        <td>
                                            <a href="/view-hoadon-history/${hoaDon.idHoaDon}" class="btn btn-success">Xem chi tiết hóa đơn</a>
                                        </td>
                                    </tr>
                                </c:forEach>
                            </tbody>
                        </table>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </div>
    </main>



    
    <!-- Ket thuc lich su dat ve-->

    <!-- feature -->

    <jsp:include page="../layout/footer.jsp"/>

    <!-- Copyright Start -->
    <div class="container-fluid copyright bg-dark py-4">
        <div class="container">
            <div class="row">
                <div class="col-md-6 text-center text-md-start mb-3 mb-md-0">
                    <span class="text-light"><a href="/"><i class="fas fa-copyright text-light me-2"></i>Laptopshop</a>, All right reserved.</span>
                </div>
                <div class="col-md-6 my-auto text-center text-md-end text-white">
                    <!--/*** This template is free as long as you keep the below author’s credit link/attribution link/backlink. ***/-->
                    <!--/*** If you'd like to use the template without the below author’s credit link/attribution link/backlink, ***/-->
                    <!--/*** you can purchase the Credit Removal License from "https://htmlcodex.com/credit-removal". ***/-->
                    Designed By <a class="border-bottom" href="https://www.facebook.com/PhuocLoc240">NguyenPhuocLoc</a>
                </div>
            </div>
        </div>
    </div>
    <!-- Copyright End -->



    <!-- Back to Top -->
    <a href="#" class="btn btn-primary border-3 border-primary rounded-circle back-to-top"><i class="fa fa-arrow-up"></i></a>   

    
<!-- JavaScript Libraries -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/js/bootstrap.bundle.min.js"></script>
<script src="/client/lib/easing/easing.min.js"></script>
<script src="/client/lib/waypoints/waypoints.min.js"></script>
<script src="/client/lib/lightbox/js/lightbox.min.js"></script>
<script src="/client/lib/owlcarousel/owl.carousel.min.js"></script>

<!-- Template Javascript -->
<script src="/client/js/main.js"></script>
</body>
</html>