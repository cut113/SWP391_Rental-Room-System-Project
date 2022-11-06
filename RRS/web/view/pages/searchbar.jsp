<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Insert title here</title>

    </head>
    <body>

        <div class="searchbar_top hidden-xs">
            <div class="searchbar_top_body">
                <div class="box-search">
                    <form action="SearchServlet" method="POST">
                        <h3 class="title">Tìm kiếm nhanh</h3>
                        <div class="bs-content">
                            <div class="row">
                                <div class="col-xs-12 col-sm-6 col-md-3">
                                    <select path="Quan" class="form-control" name="TenQuan">
                                        <option value="" label="--Chọn quận huyện--"/>
                                        <c:forEach var="q" items="${Q}" varStatus="counter">
                                            <option value=${q.getTenQuan()}  itemValue="maQuan" itemLabel="tenQuan">${q.getTenQuan()}</option>
                                        </c:forEach>
                                    </select>
                                </div>
                                <div class="col-xs-12 col-sm-6 col-md-3">
                                    <select path="Duong" class="form-control" name="TenDuong">
                                        <option value="" label="--Chọn đường phố--"/>
                                        <c:forEach var="d" items="${D}" varStatus="counter">
                                            <option value="${d.getDuongPho()}">${d.getDuongPho()}</option>
                                        </c:forEach>
                                    </select>
                                </div>
                                <div class="col-xs-12 col-sm-6 col-md-3">
                                    <input type="text" placeholder="Trong tầm giá (Triệu VNĐ)" style="width:100%" class="form-control" name="Gia"></input>
                                </div>
                                <div class="col-xs-12 col-sm-6 col-md-3">
                                    <input type="text" placeholder="Trong diện tích (m&#178)" style="width:100%" class="form-control" name="DienTich"></input>
                                </div>
                            </div>
                        </div>
                        <div class="bs-search">
                            <i class="fa fa-search"></i>
                            <input type="submit" value="Tìm Kiếm" class="button">
                        </div>
                    </form>
                </div>
            </div>
        </div>


    </body>
</html>