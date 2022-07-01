package com.employeeapp.serviceImplementation;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employeeapp.entity.AdminEntity;
import com.employeeapp.exception.ResourceNotFoundException;
import com.employeeapp.payload.AdminDto;
import com.employeeapp.repository.AdminRepository;
import com.employeeapp.service.AdminService;


@Service
public class AdminServiceImplementation implements AdminService {

	@Autowired
	AdminRepository adminRepository;

	@Autowired
	ModelMapper modelMapper;

	@Override
	public AdminDto createAdmin(AdminDto adminDto) {
		AdminEntity adminEntity = this.modelMapper.map(adminDto, AdminEntity.class);
		AdminEntity savedAdmin = this.adminRepository.save(adminEntity);
		return this.modelMapper.map(savedAdmin, AdminDto.class);
	}

	@Override
	public AdminDto getAdmin(int adminId) {
		AdminEntity adminEntity = this.adminRepository.findById(adminId)
				.orElseThrow(() -> new ResourceNotFoundException("Admin", "AdminId", adminId));
		return this.modelMapper.map(adminEntity, AdminDto.class);
	}

	@Override
	public AdminDto updateAdminById(AdminDto adminDto, int adminId) {
		AdminEntity adminEntity = this.adminRepository.findById(adminId)
				.orElseThrow(() -> new ResourceNotFoundException("Admin", "AdminId", adminId));
		AdminEntity updatedAdmin = this.modelMapper.map(adminDto, AdminEntity.class);
		AdminEntity savedAdmin = this.adminRepository.save(updatedAdmin);
		return this.modelMapper.map(savedAdmin, AdminDto.class);
	}

	@Override
	public void deleteAdminbyId(int adminId) {
		AdminEntity adminEntity = this.adminRepository.findById(adminId)
				.orElseThrow(() -> new ResourceNotFoundException("Admin", "AdminId", adminId));
		this.adminRepository.delete(adminEntity);

	}

	@Override
	public List<AdminDto> getAllAdmin() {
		List<AdminDto> adminList = this.adminRepository.findAll().stream()
				.map(admin -> this.modelMapper.map(admin, AdminDto.class)).collect(Collectors.toList());

		return adminList;
	}

}
