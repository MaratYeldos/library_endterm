package com.example.final_java_yeldos.constant;

public interface ConstantStrings {

    interface Query {

        final String getAirportBySearch = "select * from author where lower(author_name) like lower(concat('%',:author_name,'%'))";

        final String getCompanyBySearch = "select * from book where lower(book_name) like lower(concat('%',:book_name,'%'))";

    }
}
