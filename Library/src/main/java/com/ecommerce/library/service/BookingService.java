package com.ecommerce.library.service;

import com.ecommerce.library.dto.BookingDTO;
import com.ecommerce.library.dto.BookingFormDTO;
import com.ecommerce.library.dto.RoomDto;

import java.util.List;

public interface BookingService {
    public void processBooking(BookingFormDTO bookingForm, Long room_id, Long hotel_id);
    public List<BookingDTO> getBookingDTOs();
    public void processById(Long id);
    public void deleteBooking(Long booking_id, Long room_id, Long guest_id);
    public void doneById(Long id);
}
