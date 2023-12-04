package dev.patika.LibraryApp.mapper;

import dev.patika.LibraryApp.dto.request.BookBorrowingRequest;
import dev.patika.LibraryApp.dto.request.BookBorrowingUpdateRequest;
import dev.patika.LibraryApp.entity.BookBorrowing;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor"
)
@Component
public class BookBorrowingMapperImpl implements BookBorrowingMapper {

    @Override
    public BookBorrowing asEntity(BookBorrowingRequest bookBorrowingRequest) {
        if ( bookBorrowingRequest == null ) {
            return null;
        }

        BookBorrowing bookBorrowing = new BookBorrowing();

        bookBorrowing.setBorrowerName( bookBorrowingRequest.getBorrowerName() );
        bookBorrowing.setBorrowerMail( bookBorrowingRequest.getBorrowerMail() );
        bookBorrowing.setBorrowingDate( bookBorrowingRequest.getBorrowingDate() );

        return bookBorrowing;
    }

    @Override
    public BookBorrowing asEntity(BookBorrowingUpdateRequest bookBorrowingUpdateRequest) {
        if ( bookBorrowingUpdateRequest == null ) {
            return null;
        }

        BookBorrowing bookBorrowing = new BookBorrowing();

        bookBorrowing.setBorrowerName( bookBorrowingUpdateRequest.getBorrowerName() );
        bookBorrowing.setBorrowingDate( bookBorrowingUpdateRequest.getBorrowingDate() );
        bookBorrowing.setReturnDate( bookBorrowingUpdateRequest.getReturnDate() );

        return bookBorrowing;
    }

    @Override
    public void update(BookBorrowing entity, BookBorrowingUpdateRequest bookBorrowingUpdateRequest) {
        if ( bookBorrowingUpdateRequest == null ) {
            return;
        }

        entity.setBorrowerName( bookBorrowingUpdateRequest.getBorrowerName() );
        entity.setBorrowingDate( bookBorrowingUpdateRequest.getBorrowingDate() );
        entity.setReturnDate( bookBorrowingUpdateRequest.getReturnDate() );
    }
}
