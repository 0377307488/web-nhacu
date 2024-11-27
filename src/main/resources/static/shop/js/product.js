var app = angular.module("poly",[]);
app.controller("hcm",function ($http,$scope) {
    $scope.form = {}
    $scope.create = function ()
    {
        var url = "http://localhost:8080/api/product";
        var data = $scope.form;
        $http.post(url,data).then(resp =>
        {
            $scope.reset();
            $scope.load();
        })
        alert("create()")
    }
    $scope.update = function ()
    {
        var data = $scope.form;
        var url = "http://localhost:8080/api/product/"+data.id;
        $http.put(url, data).then(resp => {
            $scope.reset();
            $scope.load();
        });

        alert("update()")
    }
    $scope.delete = function (product)
    {
        var url = "http://localhost:8080/api/product/"+product.id;
        $http.delete(url).then(resp => {
            $scope.reset();
            $scope.load();
        })
    }
    $scope.reset = function ()
    {
        $scope.form=
            {
            }
        alert("reset()")
    }
    $scope.edit = function (product)
    {
        $scope.form = angular.copy(product);
    }
    $scope.load = function ()
    {
        var url = "http://localhost:8080/api/product";
        $http.get(url).then(resp => {
            $scope.product = resp.data;
        });
    }
    $scope.loadbybrand = function () {
        const brand = "Taylor";
        var url = "http://localhost:8080/api/product/" + brand;
        $http.get(url).then(resp =>{
            $scope.products=resp.data;
            $scope.brand = brand;
        })
    }
    $scope.loadbybrand();
    $scope.load();
});