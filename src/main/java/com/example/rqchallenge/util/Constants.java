package com.example.rqchallenge.util;

public interface Constants {
    String STATUS_UNKNOWN = "Unknown Error";
    String STATUS_400 = "400 Bad Request";
    String STATUS_404 = "404 Not Found";
    String STATUS_405 = "405 Method Not Allowed";
    String STATUS_429 = "429 Too Many Requests";
    String STATUS_500 = "500 Internal Server Error";

    String MSG_UNKNOWN = "Something went wrong at serverside";
    String MSG_404 = "Requested resource is not available";
    String MSG_405 = "Requested method is not available/supported by upstream system";
    String MSG_429 = "Upstream system is not able to handle multiple request concurrently..";

    String URL_HOST = "http://localhost:8080";
    String URL_BASE = "/employee-challenge-2024/api/v1";
    String URL_GET_ALL_EMPLOYEES = "/";
    String URL_GET_TOP_PAID_EMPLOYEES = "/topTenHighestEarningEmployeeNames";
    String URL_GET_HIGHEST_SALARY = "/highestSalary";
    String URL_GET_EMPLOYEE_BY_ID = "/?";
    String URL_GET_EMPLOYEE_BY_NAME = "/search/?";
    String URL_CREATE_EMPLOYEE = "/";
    String URL_DELETE_EMPLOYEE = "/?";

    String SUCCESS = "success";
    String FAIL = "fail";
}
