package me.kamesh.validation;

import org.springframework.util.unit.DataSize;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Objects;

import static me.kamesh.utils.Constants.MIME_PDF;

class PdfFileValidator implements ConstraintValidator<PdfFileConstraint, MultipartFile> {

    @Override
    public void initialize(PdfFileConstraint constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(MultipartFile multipartFile, ConstraintValidatorContext constraintValidatorContext) {
        if(multipartFile == null) {
            return false;
        }
        if (multipartFile.getSize() == 0 || isGreaterThanONEMB(multipartFile.getSize())) {
            return false;
        }
        return Objects.equals(multipartFile.getContentType(), MIME_PDF);
    }

    private boolean isGreaterThanONEMB(long s) {
        return DataSize.ofMegabytes(1)
                .compareTo(DataSize.ofBytes(s)) < 0;
    }
}
