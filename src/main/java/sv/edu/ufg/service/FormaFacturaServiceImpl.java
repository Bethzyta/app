package sv.edu.ufg.service;

import java.util.List;

import sv.edu.ufg.dao.FormaFacturaDao;
import org.springframework.beans.factory.annotation.Autowired;
import sv.edu.ufg.model.FormaFactura;

public class FormaFacturaServiceImpl implements FormaFacturaService {

	@Autowired FormaFacturaDao formaFacturaDao;
	
	public void create(FormaFactura r) {
		formaFacturaDao.create(r);
	}

	public void update(FormaFactura r) {
		formaFacturaDao.update(r);
	}

	public void delete(FormaFactura r) {
		formaFacturaDao.delete(r);
	}

	public FormaFactura find(int id) {
		return formaFacturaDao.find(id);
	}

	public List<FormaFactura> findAll() {
		return formaFacturaDao.findAll();
	}
}
