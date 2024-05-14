<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="utf-8">
        <title>Cinema - ${phim.tenPhim}</title>
        <meta content="width=device-width, initial-scale=1.0" name="viewport">
        <meta content="" name="keywords">
        <meta content="" name="description">

        <!-- Google Web Fonts -->
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Open+Sans:wght@400;600&family=Raleway:wght@600;800&display=swap" rel="stylesheet"> 

        <!-- Icon Font Stylesheet -->
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.15.4/css/all.css"/>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.4.1/font/bootstrap-icons.css" rel="stylesheet">

        <!-- Libraries Stylesheet -->
        <link href="lib/lightbox/css/lightbox.min.css" rel="stylesheet">
        <link href="/client/lib/owlcarousel/assets/owl.carousel.min.css" rel="stylesheet">


        <!-- Customized Bootstrap Stylesheet -->
        <link href="/client/css/bootstrap.min.css" rel="stylesheet">

        <!-- Template Stylesheet -->
        <link href="/client/css/style.css" rel="stylesheet">
    </head>
    
    <style>

        
                /*  */
        #manHinh {
            width: 100%;
            height: 500px;
            display: grid;
            grid-template-columns: 1fr 1fr 1fr;
            grid-gap: 10px;
            text-align: center;
        }

        ul li {
            width: 100%;
            margin-bottom: 40px;
            list-style-type: none;
            text-align: center;
        }
        #hangGheGiua {
            width: 100%;
            height: 500px;
            display: grid;
            grid-template-columns: 1fr 1fr 1fr 1fr 1fr 1fr 1fr 1fr 1fr;
            grid-gap: 10px;
            text-align: center;
        }

            #hangGheGiua .ghe {
                width: 100%;
                height: 70%;
                border: 2px solid rgb(213, 213, 213);
                display: flex;
                justify-content: center;
                align-items: center;
                cursor: pointer;
            }
        .ghe-selected {
            background-color: rgb(255, 106, 0);
        }
        #hangChuTrai {
            display: grid;
            grid-template-columns: 1fr;
            grid-gap: 10px;
        }
        .chuThich {
            width: 100%;
            height: auto;
            display: flex;
            justify-content: center;
            align-items: center;
        }

        footer {
            width: 100%;
            height: auto;
            margin-top: 70px;
            border-top: 5px solid rgb(255, 106, 0);
            display: flex;
            justify-content: space-between;
            text-align: center;
        }
        footer div {
            margin: 40px;
        }
        #trangThaiGhe, #loaiGhe {
            width: 30%;
            height: auto;
            display: flex;
            
        }
            #trangThaiGhe div, #loaiGhe div {
                margin: 5px;
            }
        .theP {
            margin: auto auto auto 5px;
            text-align: center;
        }
        .mau, .loai {
            border-radius: 5px;
            width: 20px;
            height: 20px;
        }
        .daBan {    
            background-color: lightgreen;
        }
        .dangChon {
            background-color: rgb(255, 106, 0);
        }
        .vip {
            border: 2px solid gold;
        }
        .don {
            border: 2px solid rgb(213, 213, 213)
        }
        .doi {
            width: 40px;
            border: 2px solid blue;
        }
        /* css moi  */
    .seat {
  position: relative;
  display: inline-block;
}

.seat-checkbox {
  display: none;
}

.seat-box {
  width: 40px;
  height: 40px;
  background-color: #eee;
  border: 2px solid #ddd;
  display: block;
  cursor: pointer;
  transition: background-color 0.3s ease;
}

.seat-checkbox:checked + .seat-box {
  background-color: #ffa500; 
}

/*  
    disable checkbox
*/
.pseudo-disabled {
    pointer-events: none; /* Ngăn không cho người dùng click vào checkbox */
    opacity: 0.4; /* Làm mờ checkbox để trông giống như đã bị disable */
}
 

       

    </style>


    <body>

        <!-- Spinner Start -->
        <div id="spinner" class="show w-100 vh-100 bg-white position-fixed translate-middle top-50 start-50  d-flex align-items-center justify-content-center">
            <div class="spinner-grow text-primary" role="status"></div>
        </div>
        <!-- Spinner End -->


        <jsp:include page="../layout/header.jsp"/>


        <!-- Modal Search Start -->
        <div class="modal fade" id="searchModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
            <div class="modal-dialog modal-fullscreen">
                <div class="modal-content rounded-0">
                    <div class="modal-header">
                        <h5 class="modal-title" id="exampleModalLabel">Search by keyword</h5>
                        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                    </div>
                    <div class="modal-body d-flex align-items-center">
                        <div class="input-group w-75 mx-auto d-flex">
                            <input type="search" class="form-control p-3" placeholder="keywords" aria-describedby="search-icon-1">
                            <span id="search-icon-1" class="input-group-text p-3"><i class="fa fa-search"></i></span>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- Modal Search End -->


        <!-- Single Product Start -->
        <div class="container-fluid py-5 mt-5">
            <div class="container py-5">
                <div class="row g-4 mb-5">

                    <div>
                        <nav arial-label="breadcrumb">
                            <ol class="breadcrumb">
                                <li class="breadcrumb-item"><a href="/">Trang chủ</a></li>
                                <li class="breadcrumb-item active" aria-current="page">Đặt vé</li>

                            </ol>

                        </nav>
                    </div>

                    <div class="col-lg-8 col-xl-9">
                        <div class="row g-4">
                            <div class="col-lg-6">
                                <div class="border rounded">
                                    <a href="#">
                                        <img src="/images/phim/${phim.hinhAnh}" class="img-fluid rounded" alt="Image">
                                    </a>
                                </div>
                            </div>
                            <div class="col-lg-6">
                                <h4 class="fw-bold mb-3">${phim.tenPhim}</h4>
                                <p class="mb-3">Thời lượng: ${phim.thoiLuong} phút</p>
                                <p class="mb-3">Đạo diễn: ${phim.daoDien}</p>
                                <h5 class="fw-bold mb-3">
                                  
                                </h5>
                                <div class="d-flex mb-4">
                                    <i class="fa fa-star text-secondary"></i>
                                    <i class="fa fa-star text-secondary"></i>
                                    <i class="fa fa-star text-secondary"></i>
                                    <i class="fa fa-star text-secondary"></i>
                                    <i class="fa fa-star text-secondary"></i>
                                </div>
                                <p class="mb-4">Diễn viên: ${phim.dienVien}</p>
                        
                                <form:form id="formSeat" method="post" action="/selectSeat"  enctype="multipart/form-data" modelAttribute="selectedSeat">
                                    <!-- Đặt các input ẩn để chứa idGhe và soGhe -->
                                    <input type="hidden" id="idGheInput" name="idGhe" value="" path="idGhe">
                                    <input type="hidden" id="idCaChieuInput" name="idCaChieu" value="" path="idCaChieu">
                                    <!-- <input type="hidden" id="soGheInput" name="soGhe" value=""> -->
                                    <!-- Thêm button để submit form -->
                                    <button type="submit" id="submitButton" class="btn border border-secondary rounded-pill px-4 py-2 mb-4 text-primary">
                                        <i class="fa fa-shopping-bag me-2 text-primary"></i> 
                                        Đặt vé
                                    </button>
                                </form:form>
                            </div>
                            <div class="col-lg-12">
                                <nav>
                                    <div class="nav nav-tabs mb-3">
                                        <button class="nav-link active border-white border-bottom-0" type="button" role="tab"
                                            id="nav-about-tab" data-bs-toggle="tab" data-bs-target="#nav-about"
                                            aria-controls="nav-about" aria-selected="true">Mô tả</button>
                                    </div>
                                </nav>
                                <div class="tab-content mb-5">
                                    <div class="tab-pane active" id="nav-about" role="tabpanel" aria-labelledby="nav-about-tab">
                                        <p>
                                            ${phim.noiDung}
                                        </p>
                                        
                                    </div>
                                </div>
                                <div class="tab-content mb-5">
                                    <c:forEach var="caChieu" items="${listCaChieu}">
                                        <div class="tab-pane active display-flex" id="nav-about" role="tabpanel" aria-labelledby="nav-about-tab">
                                            <div class="container">
                                                <div class="row justify-content-start">
                                                    <div class="col-6"> 
                                                        <input id = "caChieu${caChieu.idCaChieu}" type="radio" name="CaChieu" value="${caChieu.idCaChieu}">
                                                        <label for="caChieu${caChieu.idCaChieu}" class="bg-primary text-white rounded p-3"> 
                                                            ${caChieu.ngayChieu} <br>
                                                            ${caChieu.gioBatDau}
                                                        </label>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>

                                    </c:forEach>
                                </div>

                            </div>
                            
                            <!-- Render ghế ngồi ra -->
                            <div class="chuThich"> Màn hình</div>
                            <footer>
                                <div id="trangThaiGhe">
                                    <div class="mau daBan"></div>
                                    <p class="gheDaBan theP">Ghế đã bán</p>
                                    <div class="mau dangChon"></div>
                                    <p class="gheDangChon theP">Ghế đang chọn</p>
                                </div>
                                <div id="loaiGhe">
                                    <div class="loai vip"></div>
                                    <p id="gheVip theP">Ghế VIP </p>
                                    <div class="loai don"></div>
                                    <p id="gheDon theP">Ghế đơn</p>
                                    <div class="loai doi"></div>
                                    <p id="gheDoi theP">Ghế đôi</p>
                                </div>
                            </footer>
                            <div id="manHinh">
                                <div id="hangChuPhai">
                                    <ul>
                                        <c:forEach var="hangGhe" items="${listHangGhe}">
                                            <li>${hangGhe.hangGhe}</li>
                                        </c:forEach>
                                    </ul>
                                </div>
                                
                                

                                <div id="hangGheGiua">
                                    <c:forEach var="gheA" items="${listGheHangA}">
                                        <label class="seat ${gheA.trangThai == 1 ? 'daBan pseudo-disabled' : ''}">
                                            <input type="checkbox" class="seat-checkbox" name="${gheA.idGhe}"  data-id-ghe="${gheA.idGhe}">
                                            <span class="seat-box">${gheA.soGhe.soGhe}</span>
                                        </label>
                                          

                                        
                                        <!-- <input type="checkbox" name="${gheA.idGhe}" data-id-ghe="${gheA.idGhe}">
                                        <label for="{gheA.idGhe}">${gheA.soGhe.soGhe}</label> -->
                                    </c:forEach>

                                    <c:forEach var="gheB" items="${listGheHangB}">
                                        <!-- <input type="checkbox" name="${gheB.idGhe}" data-id-ghe="${gheB.idGhe}">
                                        <label for="{gheB.idGhe}">${gheB.soGhe.soGhe}</label> -->
                                        <label class="seat ${gheB.trangThai == 1 ? 'daBan pseudo-disabled' : ''}">
                                            <input type="checkbox" class="seat-checkbox" name="${gheB.idGhe}" data-id-ghe="${gheB.idGhe}">
                                            <span class="seat-box">${gheB.soGhe.soGhe}</span>
                                        </label>
                                    </c:forEach>

                                    <c:forEach var="gheC" items="${listGheHangC}">
                                        <!-- <input type="checkbox" name="${gheC.idGhe}" data-id-ghe="${gheC.idGhe}">
                                        <label for="{gheC.idGhe}">${gheC.soGhe.soGhe}</label> -->

                                        <label class="seat ${gheC.trangThai == 1 ? 'daBan pseudo-disabled' : ''}">
                                            <input type="checkbox" class="seat-checkbox" name="${gheC.idGhe}" data-id-ghe="${gheC.idGhe}">
                                            <span class="seat-box">${gheC.soGhe.soGhe}</span>
                                        </label>
                                    </c:forEach>

                                    <c:forEach var="gheD" items="${listGheHangD}">
                                        <!-- <input type="checkbox" name="${gheD.idGhe}" data-id-ghe="${gheD.idGhe}">
                                        <label for="{gheD.idGhe}">${gheD.soGhe.soGhe}</label> -->
                                        <label class="seat ${gheD.trangThai == 1 ? 'daBan pseudo-disabled' : ''}">
                                            <input type="checkbox" class="seat-checkbox" name="${gheD.idGhe}" data-id-ghe="${gheD.idGhe}">
                                            <span class="seat-box">${gheD.soGhe.soGhe}</span>
                                        </label>
                                    </c:forEach>

                                    <c:forEach var="gheE" items="${listGheHangE}">
                                        <!-- <input type="checkbox" name="${gheE.idGhe}" data-id-ghe="${gheE.idGhe}">
                                        <label for="{gheE.idGhe}">${gheE.soGhe.soGhe}</label> -->

                                        <label class="seat ${gheE.trangThai == 1 ? 'daBan pseudo-disabled' : ''}">
                                            <input type="checkbox" class="seat-checkbox" name="${gheE.idGhe}" data-id-ghe="${gheE.idGhe}">
                                            <span class="seat-box">${gheE.soGhe.soGhe}</span>
                                        </label>
                                    </c:forEach>
                                    
                                    <c:forEach var="gheF" items="${listGheHangF}">
                                        <!-- <input type="checkbox" name="${gheF.idGhe}" data-id-ghe="${gheF.idGhe}">
                                        <label for="{gheF.idGhe}">${gheF.soGhe.soGhe}</label> -->
                                        <label class="seat ${gheF.trangThai == 1 ? 'daBan pseudo-disabled' : ''}">
                                            <input type="checkbox" class="seat-checkbox" name="${gheF.idGhe}" data-id-ghe="${gheF.idGhe}">
                                            <span class="seat-box">${gheF.soGhe.soGhe}</span>
                                        </label>
                                    </c:forEach>

                                    <c:forEach var="gheG" items="${listGheHangG}">
                                        <!-- <input type="checkbox" name="${gheG.idGhe}" data-id-ghe="${gheG.idGhe}">
                                        <label for="{gheG.idGhe}">${gheG.soGhe.soGhe}</label> -->

                                        <label class="seat ${gheG.trangThai == 1 ? 'daBan pseudo-disabled' : ''}">
                                            <input type="checkbox" class="seat-checkbox" name="${gheG.idGhe}" data-id-ghe="${gheG.idGhe}">
                                            <span class="seat-box">${gheG.soGhe.soGhe}</span>
                                        </label>
                                    </c:forEach>

                                    <c:forEach var="gheH" items="${listGheHangH}">
                                        <!-- <input type="checkbox" name="${gheH.idGhe}" data-id-ghe="${gheH.idGhe}">
                                        <label for="{gheH.idGhe}">${gheH.soGhe.soGhe}</label> -->
                                        <label class="seat ${gheH.trangThai == 1 ? 'daBan pseudo-disabled' : ''}">
                                            <input type="checkbox" class="seat-checkbox" name="${gheH.idGhe}" data-id-ghe="${gheH.idGhe}"  >
                                            <span class="seat-box">${gheH.soGhe.soGhe}</span>
                                        </label>
                                    </c:forEach>

                                    <c:forEach var="gheI" items="${listGheHangI}">
                                        <!-- <input type="checkbox" name="${gheI.idGhe}" data-id-ghe="${gheI.idGhe}">
                                        <label for="{gheI.idGhe}">${gheI.soGhe.soGhe}</label> -->
                                        <label class="seat ${gheI.trangThai == 1 ? 'daBan pseudo-disabled' : ''}">
                                            <input type="checkbox" class="seat-checkbox" name="${gheI.idGhe}" data-id-ghe="${gheI.idGhe}">
                                            <span class="seat-box">${gheI.soGhe.soGhe}</span>
                                        </label>
                                    </c:forEach>
                                 <!--  -->
                                </div>
                        
                                <div id="hangChuTrai">
                                    <ul>
                                        <c:forEach var="hangGhe" items="${listHangGhe}">
                                            <li>${hangGhe.hangGhe}</li>
                                        </c:forEach>
                                    </ul>
                                </div>
                            </div>
                            
                            
                                                                    
                            
                        </div>
                    </div>
                    <div class="col-lg-4 col-xl-3">
                        <div class="row g-4 fruite">
                            <div class="col-lg-12">
                                <div class="input-group w-100 mx-auto d-flex mb-4">
                                    <input type="search" class="form-control p-3" placeholder="keywords" aria-describedby="search-icon-1">
                                    <span id="search-icon-1" class="input-group-text p-3"><i class="fa fa-search"></i></span>
                                </div>
                                <div class="mb-4">
                                    <h4>Categories</h4>
                                    <ul class="list-unstyled fruite-categorie">
                                      

                                        
                                            <li>
                                                <div class="d-flex justify-content-between fruite-name">
                                                    <a href="#"><i class="fas fa-apple-alt me-2"></i>Apple</a>
                                                    <span>(3)</span>
                                                </div>
                                            </li>
                                  
                                        <li>
                                            <div class="d-flex justify-content-between fruite-name">
                                                <a href="#"><i class="fas fa-apple-alt me-2"></i>Asus</a>
                                                <span>(5)</span>
                                            </div>
                                        </li>
                                        <li>
                                            <div class="d-flex justify-content-between fruite-name">
                                                <a href="#"><i class="fas fa-apple-alt me-2"></i>Dell</a>
                                                <span>(2)</span>
                                            </div>
                                        </li>
                                        <li>
                                            <div class="d-flex justify-content-between fruite-name">
                                                <a href="#"><i class="fas fa-apple-alt me-2"></i>Acer</a>
                                                <span>(8)</span>
                                            </div>
                                        </li>
                                        <li>
                                            <div class="d-flex justify-content-between fruite-name">
                                                <a href="#"><i class="fas fa-apple-alt me-2"></i>Lenovo</a>
                                                <span>(5)</span>
                                            </div>
                                        </li>
                                    </ul>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            
            </div>
        </div>
        <!-- Single Product End -->
    

        <!-- Footer Start -->
        <jsp:include page="../layout/footer.jsp"/>
        <!-- Footer End -->

        <!-- Copyright Start -->
        <div class="container-fluid copyright bg-dark py-4">
            <div class="container">
                <div class="row">
                    <div class="col-md-6 text-center text-md-start mb-3 mb-md-0">
                        <span class="text-light"><a href="#"><i class="fas fa-copyright text-light me-2"></i>Your Site Name</a>, All right reserved.</span>
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
    <script>
        // // Wait for the DOM to load
        // document.addEventListener('DOMContentLoaded', function () {
        //     // Get all the div elements with class 'ghe'
        //     var seats = document.getElementsByClassName('ghe');
    
        //     // Add click event listener to each div
        //     for (var i = 0; i < seats.length; i++) {
        //         seats[i].addEventListener('click', function () {
        //             // Toggle the 'ghe-selected' class when a div is clicked
        //             this.classList.toggle('ghe-selected');
        //         });
        //     }
        // })
        $(document).ready(function(){
            console.log("=====================");
            let selectedSeat = [];

            $("input[type='checkbox']").change(function() {
                if(this.checked) {
                    selectedSeat.push($(this).data('id-ghe'));
                } else{
                    var index = selectedSeat.indexOf($(this).data('id-ghe'));
                    if (index !== -1) {
                        selectedSeat.splice(index, 1);
                    }
                }
                // console.log($(this));       
            });
            // console.log(selectedSeat);

            $('#formSeat').submit(function (evt) {
                console.log("=======================");
                // evt.preventDefault();
                $('#idGheInput').val(JSON.stringify(selectedSeat));

                var selectedCaChieuId = $('input[name="CaChieu"]:checked').val();
                $('#idCaChieuInput').val(selectedCaChieuId);
            });
        });

    </script>
    

    <!-- Template Javascript -->
    <script src="/client/js/main.js"></script>
    </body>

</html>