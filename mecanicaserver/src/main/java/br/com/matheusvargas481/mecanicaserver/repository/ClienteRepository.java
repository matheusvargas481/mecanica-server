package br.com.matheusvargas481.mecanicaserver.repository;

import br.com.matheusvargas481.mecanicaserver.ClienteDTO;
import br.com.matheusvargas481.mecanicaserver.config.DataSourceConfig;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClienteRepository {
    private DataSourceConfig dataSourceConfig;

    public ClienteRepository(DataSourceConfig dataSourceConfig) {
        this.dataSourceConfig = dataSourceConfig;
    }

    public ClienteDTO buscarPorId(Long id) {
        try (Connection connection = dataSourceConfig.mysqlDataSource().getConnection();
             PreparedStatement statement = connection.prepareStatement("SELECT * FROM CLIENTE WHERE id = ?;")) {
            statement.setLong(1, id);
            try (ResultSet resultSet = statement.executeQuery()) {
                ClienteDTO clienteDTO = new ClienteDTO();
                while (resultSet.next()) {
                    clienteDTO.setId(resultSet.getLong("id"));
                    clienteDTO.setNome(resultSet.getString("nome"));
                    clienteDTO.setNumeroTelefone(resultSet.getString("numeroTelefone"));
                    clienteDTO.setDocumentoNumero(resultSet.getString("documentoNumero"));
                    clienteDTO.setEmail(resultSet.getString("email"));
                }
                return clienteDTO;
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao salvar o cliente !");
        }
    }

    public List<ClienteDTO> buscarPorNome(String nome) {
        List<ClienteDTO> clienteDTOList = new ArrayList<>();
        try (Connection connection = dataSourceConfig.mysqlDataSource().getConnection();
             PreparedStatement statement = connection.prepareStatement("SELECT * FROM CLIENTE WHERE nome LIKE ?;")) {
            statement.setString(1, "%" + nome + "%");
            try (ResultSet resultSet = statement.executeQuery()) {
                ClienteDTO clienteDTO = new ClienteDTO();
                while (resultSet.next()) {
                    clienteDTO.setId(resultSet.getLong("id"));
                    clienteDTO.setNome(resultSet.getString("nome"));
                    clienteDTO.setNumeroTelefone(resultSet.getString("numeroTelefone"));
                    clienteDTO.setDocumentoNumero(resultSet.getString("documentoNumero"));
                    clienteDTO.setEmail(resultSet.getString("email"));
                    clienteDTOList.add(clienteDTO);
                }
                return clienteDTOList;
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao buscar cliente !");
        }
    }

    public ClienteDTO salvar(ClienteDTO clienteDTO) {
        try (Connection connection = dataSourceConfig.mysqlDataSource().getConnection();
             PreparedStatement statement = connection.prepareStatement("INSERT INTO CLIENTE (nome, numeroTelefone, documentoNumero, email) VALUES (?,?,?,?)")) {
            statement.setString(1, clienteDTO.getNome());
            statement.setString(2, clienteDTO.getNumeroTelefone());
            statement.setString(3, clienteDTO.getDocumentoNumero());
            statement.setString(4, clienteDTO.getEmail());
            statement.executeUpdate();
            return clienteDTO;
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao salvar o cliente !");
        }
    }

    public ClienteDTO atualizar(ClienteDTO clienteDTO) {
        try (Connection connection = dataSourceConfig.mysqlDataSource().getConnection();
             PreparedStatement statement = connection.prepareStatement("UPDATE CLIENTE SET name = ?, cpf = ? WHERE id = ?; ")) {
            statement.setString(1, clienteDTO.getName());
            statement.setString(2, clienteDTO.getCpf());
            statement.setLong(3, clienteDTO.getId());
            statement.executeUpdate();
            return clienteDTO;
        } catch (SQLException e) {
            throw new RuntimeException("Error update customer !");
        }
    }

    public boolean deleteCostumer(ClienteDTO clienteDTO) {
        try (Connection connection = dataSourceConfig.mysqlDataSource().getConnection();
             PreparedStatement statement = connection.prepareStatement("DELETE FROM CLIENTE WHERE id = ?;")) {
            statement.setLong(1, clienteDTO.getId());
            statement.executeUpdate();
            return true;
        } catch (SQLException e) {
            throw new RuntimeException("Error deleting customer !");
        }
    }

    public List<ClienteDTO> findAll() {
        List<ClienteDTO> clienteDTOList = new ArrayList<>();
        try (Connection connection = dataSourceConfig.mysqlDataSource().getConnection();
             PreparedStatement statement = connection.prepareStatement("SELECT * FROM CLIENTE;")) {
            try (ResultSet resultSet = statement.executeQuery()) {
                findCostumer(resultSet, clienteDTOList);
            }
            return clienteDTOList;
        } catch (SQLException e) {
            throw new RuntimeException();
        }
    }

    private void findCostumer(ResultSet resultSet, List<ClienteDTO> customers) {
        while (true) {
            try {
                if (!resultSet.next()) break;
                ClienteDTO clienteDTO = new ClienteDTO();
                clienteDTO.setId(resultSet.getLong("id"));
                clienteDTO.setName(resultSet.getString("nome"));
                clienteDTO.setCpf(resultSet.getString("cpf"));
                customers.add(customer);
            } catch (SQLException e) {
                throw new RuntimeException();
            }
        }
    }
}
