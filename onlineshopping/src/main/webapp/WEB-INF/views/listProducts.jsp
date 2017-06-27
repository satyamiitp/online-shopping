<div class="contaner">
 
  <div class="row">
  
  <!-- To Display sidebar -->
   
   <div class="col-md-3">
   
    <%@include file="./shared/sidebar.jsp" %>
    </div>
    
    
    <!-- To display the actual products  -->
    <div class="col-md-9">
    
    <div class ="row">
     
     <div class="col-lg-12">
     
     <c:if test="${userClickAllProdutcs==true}">
     <ol class="breadcrumb">
     
     <li><a href="${contextRoot}/home">Home</a></li>
     <li class="active"> All Products</li>
     
     </ol>
     </c:if>
     
     <c:if test="${userClickCategoryProdutcs==true}">
     <ol class="breadcrumb">
     
     <li><a href="${contextRoot}/home">Home</a></li>
     <li class="active">Category</li>
     <li class="active">${category.name} </li>
     
     </ol>
     </c:if>
     
     </div>
     
    
    
    
    
    </div>
    
    
    </div>
    
    </div>
    
    
    </div>
  