<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.16/css/jquery.dataTables.min.css"/>
    <script type="text/javascript" src="https://cdn.datatables.net/v/bs/jq-3.2.1/dt-1.10.16/datatables.min.js"></script>
</head>

<h3>Text files:</h3>

<br/>
    <ul>
        <c:forEach items="${files}" var="file">
            <li>
                <button type="button" class="btn btn-info btn-lg" data-toggle="modal" data-target="#myModal">File_${file.id}</button>
                <!-- Modal -->
                <div id="myModal" class="modal fade" role="dialog">
                    <div class="modal-dialog">

                        <!-- Modal content-->
                        <div class="modal-content">
                            <div class="modal-header">
                                <button type="button" class="close" data-dismiss="modal">&times;</button>
                                <h4 class="modal-title">File_${file.id}</h4>
                            </div>
                            <div class="modal-body">
                                <p><table id="myTable" class="display" style="width:100%">
                                <thead>
                                <tr>
                                    <td>Line</td>
                                    <td>Line length</td>
                                    <td>Min word</td>
                                    <td>Max word</td>
                                    <td>Line average word</td>
                                </tr>
                                </thead>
                                <tbody>
                                <c:forEach items="${file.linesList}" var="line">
                                    <tr>
                                        <td>${line.line}</td>
                                        <td>${line.lineLength}</td>
                                        <td>${line.minWord}</td>
                                        <td>${line.maxWord}</td>
                                        <td>${line.averageWord}</td>
                                    </tr>
                                </c:forEach>
                                </tbody>
                                <tfoot>
                                <tr>
                                    <td>Line</td>
                                    <td>Line length</td>
                                    <td>Min word</td>
                                    <td>Max word</td>
                                    <td>Line average word</td>
                                </tr>
                                </tfoot>

                            </table>
                                </p>
                            </div>
                            <div class="modal-footer">
                                <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                            </div>
                        </div>

                    </div>
                </div>
            </li>
        </c:forEach>
    </ul>

    <br/>

<script>
    $(document).ready(function() {
        $('#myTable').DataTable( {
            "order": [[ 3, "desc" ]]
        } );
    } );
</script>
</body>
</html>
